package user.dao;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import user.domain.User;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.rmi.server.ExportException;

public class UserDaoImpl implements UserDao{

    private String path = "D:/program/java/user.xml";

    public User findByUsername(String username) {
        SAXReader reader = new SAXReader();
        try {
            Document doc = reader.read(path);
            Element element = (Element) doc.selectSingleNode("//user[@username='" + username + "']");
            if (element == null) return null;
            User user = new User();
            String attrUsername = element.attributeValue("username");
            String attrPassword = element.attributeValue("password");
            user.setUsername(attrUsername);
            user.setPassword(attrPassword);
            return user;
        } catch (DocumentException e) {
            throw new RuntimeException(e);
        }
    }

    public void add(User user) {
        SAXReader reader = new SAXReader();
        try {
            Document doc = reader.read(path);
            // 得到根元素
            Element root = doc.getRootElement();
            // 通过根元素创建新元素
            Element userEle = root.addElement("user");
            // 为userEle设置属性
            userEle.addAttribute("username", user.getUsername());
            userEle.addAttribute("password", user.getPassword());
            // 创建格式化器， 使用tab缩进，支持换行
            OutputFormat format = new OutputFormat("\t", true);
            // 清空原有的换行、缩进
            format.setTrimText(true);
            // 创建XmlWriter
            try {
                XMLWriter xmlWriter = new XMLWriter(new OutputStreamWriter(new FileOutputStream(path), "utf-8"), format);
                xmlWriter.write(doc);
                xmlWriter.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } catch (DocumentException e) {
            throw new RuntimeException(e);
        }
    }
}
