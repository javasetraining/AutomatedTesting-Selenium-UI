package com.simpals.selenium.common;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class Config {

    private static String language;
    private static String homePageUrl;
    private static String myAccountUrl;

    private static void getDataConfig() throws Exception {
        try {
            String configName = System.getProperty("project.config", "local.config.xml");
            DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(new File(configName));
            doc.getDocumentElement().normalize();

            NodeList languageNode = doc.getElementsByTagName("language");
            NodeList homePageUrlNode = doc.getElementsByTagName("default-project-url");


            language = languageNode.item(0).getTextContent();
            homePageUrl = homePageUrlNode.item(0).getTextContent();

        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }
    }

    public static String getLanguage() throws Exception {
        getDataConfig();
        return language;
    }

    public static String getHomePageUrl() throws Exception {
        getDataConfig();
        return homePageUrl;
    }

    public static String getMyAccountUrl() throws Exception {
        getDataConfig();
        return myAccountUrl;


    }
}