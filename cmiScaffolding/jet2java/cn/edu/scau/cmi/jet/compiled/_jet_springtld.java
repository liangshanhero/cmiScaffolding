package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;

public class _jet_springtld implements JET2Template {

    public _jet_springtld() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<taglib xmlns=\"http://java.sun.com/xml/ns/j2ee\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\txmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\txsi:schemaLocation=\"http://java.sun.com/xml/ns/j2ee http://java.sun.com/xml/ns/j2ee/web-jsptaglibrary_2_0.xsd\"");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tversion=\"2.0\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t<description>Spring Framework JSP Tag Library</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<tlib-version>3.0</tlib-version>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<short-name>spring</short-name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t<uri>http://www.springframework.org/tags</uri>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t<tag>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tSets default HTML escape value for the current page.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tOverrides a \"defaultHtmlEscape\" context-param in web.xml, if any.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<name>htmlEscape</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<tag-class>org.springframework.web.servlet.tags.HtmlEscapeTag</tag-class>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<body-content>JSP</body-content>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<description>Set the default value for HTML escaping, to be put");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tinto the current PageContext.</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>defaultHtmlEscape</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<required>true</required>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<rtexprvalue>true</rtexprvalue>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</tag>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t<tag>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tEscapes its enclosed body content, applying HTML escaping and/or JavaScript escaping.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tThe HTML escaping flag participates in a page-wide or application-wide setting");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t(i.e. by HtmlEscapeTag or a \"defaultHtmlEscape\" context-param in web.xml).");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<name>escapeBody</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<tag-class>org.springframework.web.servlet.tags.EscapeBodyTag</tag-class>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<body-content>JSP</body-content>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<description>Set HTML escaping for this tag, as boolean value. Overrides the");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tdefault HTML escaping setting for the current page.</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>htmlEscape</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<required>false</required>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<rtexprvalue>true</rtexprvalue>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<description>Set JavaScript escaping for this tag, as boolean value.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tDefault is false.</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>javaScriptEscape</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<required>false</required>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<rtexprvalue>true</rtexprvalue>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</tag>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t<tag>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tRetrieves the message with the given code, or text if code isn't resolvable.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tThe HTML escaping flag participates in a page-wide or application-wide setting");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t(i.e. by HtmlEscapeTag or a \"defaultHtmlEscape\" context-param in web.xml).");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<name>message</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<tag-class>org.springframework.web.servlet.tags.MessageTag</tag-class>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<body-content>JSP</body-content>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<description>A MessageSourceResolvable argument (direct or through JSP EL).");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tFits nicely when used in conjunction with Spring's own validation error");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tclasses which all implement the MessageSourceResolvable interface. For");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\texample, this allows you to iterate over all of the errors in a form,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tpassing each error (using a runtime expression) as the value of this");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t'message' attribute, thus effecting the easy display of such error");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tmessages.</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>message</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<required>false</required>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<rtexprvalue>true</rtexprvalue>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<description>The code (key) to use when looking up the message.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tIf code is not provided, the text attribute will be used.</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>code</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<required>false</required>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<rtexprvalue>true</rtexprvalue>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<description>Set optional message arguments for this tag, as a");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t(comma-)delimited String (each String argument can contain JSP EL),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tan Object array (used as argument array), or a single Object (used");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tas single argument).</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>arguments</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<required>false</required>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<rtexprvalue>true</rtexprvalue>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<description>The separator character to be used for splitting the");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\targuments string value; defaults to a 'comma' (',').</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>argumentSeparator</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<required>false</required>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<rtexprvalue>true</rtexprvalue>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<description>Default text to output when a message for the given code");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tcould not be found. If both text and code are not set, the tag will");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\toutput null.</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>text</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<required>false</required>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<rtexprvalue>true</rtexprvalue>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<description>The string to use when binding the result to the page,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\trequest, session or application scope. If not specified, the result");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tgets outputted to the writer (i.e. typically directly to the JSP).</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>var</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<required>false</required>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<rtexprvalue>true</rtexprvalue>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<description>The scope to use when exporting the result to a variable.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tThis attribute is only used when var is also set. Possible values are");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tpage, request, session and application.</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>scope</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<required>false</required>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<rtexprvalue>true</rtexprvalue>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<description>Set HTML escaping for this tag, as boolean value.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tOverrides the default HTML escaping setting for the current page.</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>htmlEscape</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<required>false</required>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<rtexprvalue>true</rtexprvalue>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<description>Set JavaScript escaping for this tag, as boolean value. Default is false.</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>javaScriptEscape</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<required>false</required>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<rtexprvalue>true</rtexprvalue>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</tag>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t<tag>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tRetrieves the theme message with the given code, or text if code isn't resolvable.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tThe HTML escaping flag participates in a page-wide or application-wide setting");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t(i.e. by HtmlEscapeTag or a \"defaultHtmlEscape\" context-param in web.xml).");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<name>theme</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<tag-class>org.springframework.web.servlet.tags.ThemeTag</tag-class>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<body-content>JSP</body-content>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<description>A MessageSourceResolvable argument (direct or through JSP EL).</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>message</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<required>false</required>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<rtexprvalue>true</rtexprvalue>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<description>The code (key) to use when looking up the message.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tIf code is not provided, the text attribute will be used.</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>code</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<required>false</required>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<rtexprvalue>true</rtexprvalue>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<description>Set optional message arguments for this tag, as a");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t(comma-)delimited String (each String argument can contain JSP EL),");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tan Object array (used as argument array), or a single Object (used");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tas single argument).</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>arguments</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<required>false</required>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<rtexprvalue>true</rtexprvalue>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<description>The separator character to be used for splitting the");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\targuments string value; defaults to a 'comma' (',').</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>argumentSeparator</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<required>false</required>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<rtexprvalue>true</rtexprvalue>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<description>Default text to output when a message for the given code");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tcould not be found. If both text and code are not set, the tag will");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\toutput null.</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>text</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<required>false</required>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<rtexprvalue>true</rtexprvalue>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<description>The string to use when binding the result to the page,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\trequest, session or application scope. If not specified, the result");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tgets outputted to the writer (i.e. typically directly to the JSP).</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>var</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<required>false</required>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<rtexprvalue>true</rtexprvalue>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<description>The scope to use when exporting the result to a variable.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tThis attribute is only used when var is also set. Possible values are");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tpage, request, session and application.</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>scope</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<required>false</required>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<rtexprvalue>true</rtexprvalue>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<description>Set HTML escaping for this tag, as boolean value.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tOverrides the default HTML escaping setting for the current page.</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>htmlEscape</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<required>false</required>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<rtexprvalue>true</rtexprvalue>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<description>Set JavaScript escaping for this tag, as boolean value. Default is false.</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>javaScriptEscape</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<required>false</required>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<rtexprvalue>true</rtexprvalue>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</tag>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t<tag>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tProvides Errors instance in case of bind errors.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tThe HTML escaping flag participates in a page-wide or application-wide setting");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t(i.e. by HtmlEscapeTag or a \"defaultHtmlEscape\" context-param in web.xml).");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<name>hasBindErrors</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<tag-class>org.springframework.web.servlet.tags.BindErrorsTag</tag-class>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<body-content>JSP</body-content>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<variable>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name-given>errors</name-given>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<variable-class>org.springframework.validation.Errors</variable-class>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</variable>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<description>The name of the bean in the request, that needs to be");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tinspected for errors. If errors are available for this bean, they");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\twill be bound under the 'errors' key.</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>name</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<required>true</required>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<rtexprvalue>true</rtexprvalue>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<description>Set HTML escaping for this tag, as boolean value.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tOverrides the default HTML escaping setting for the current page.</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>htmlEscape</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<required>false</required>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<rtexprvalue>true</rtexprvalue>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</tag>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t<tag>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tSets a nested path to be used by the bind tag's path.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<name>nestedPath</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<tag-class>org.springframework.web.servlet.tags.NestedPathTag</tag-class>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<body-content>JSP</body-content>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<variable>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name-given>nestedPath</name-given>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<variable-class>java.lang.String</variable-class>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</variable>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<description>Set the path that this tag should apply. E.g. 'customer'");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tto allow bind paths like 'address.street' rather than");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t'customer.address.street'.</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>path</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<required>true</required>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<rtexprvalue>true</rtexprvalue>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</tag>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t<tag>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tProvides BindStatus object for the given bind path.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tThe HTML escaping flag participates in a page-wide or application-wide setting");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t(i.e. by HtmlEscapeTag or a \"defaultHtmlEscape\" context-param in web.xml).");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<name>bind</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<tag-class>org.springframework.web.servlet.tags.BindTag</tag-class>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<body-content>JSP</body-content>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<variable>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name-given>status</name-given>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<variable-class>org.springframework.web.servlet.support.BindStatus</variable-class>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</variable>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<description>The path to the bean or bean property to bind status");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tinformation for. For instance account.name, company.address.zipCode");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tor just employee. The status object will exported to the page scope,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tspecifically for this bean or bean property</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>path</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<required>true</required>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<rtexprvalue>true</rtexprvalue>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<description>Set whether to ignore a nested path, if any. Default is to not ignore.</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>ignoreNestedPath</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<required>false</required>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<rtexprvalue>true</rtexprvalue>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<description>Set HTML escaping for this tag, as boolean value. Overrides");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthe default HTML escaping setting for the current page.</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>htmlEscape</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<required>false</required>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<rtexprvalue>true</rtexprvalue>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</tag>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t<tag>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tProvides transformation of variables to Strings, using an appropriate");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tcustom PropertyEditor from BindTag (can only be used inside BindTag).");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tThe HTML escaping flag participates in a page-wide or application-wide setting");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t(i.e. by HtmlEscapeTag or a 'defaultHtmlEscape' context-param in web.xml).");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<name>transform</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<tag-class>org.springframework.web.servlet.tags.TransformTag</tag-class>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<body-content>JSP</body-content>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<description>The value to transform. This is the actual object you want");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tto have transformed (for instance a Date). Using the PropertyEditor that");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tis currently in use by the 'spring:bind' tag.</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>value</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<required>true</required>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<rtexprvalue>true</rtexprvalue>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<description>The string to use when binding the result to the page,");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\trequest, session or application scope. If not specified, the result gets");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\toutputted to the writer (i.e. typically directly to the JSP).</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>var</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<required>false</required>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<rtexprvalue>true</rtexprvalue>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<description>The scope to use when exported the result to a variable.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tThis attribute is only used when var is also set. Possible values are");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tpage, request, session and application.</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>scope</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<required>false</required>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<rtexprvalue>true</rtexprvalue>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<description>Set HTML escaping for this tag, as boolean value. Overrides");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthe default HTML escaping setting for the current page.</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>htmlEscape</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<required>false</required>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<rtexprvalue>true</rtexprvalue>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</tag>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t<tag>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<description>URL tag based on the JSTL c:url tag.  This variant is fully ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tbackwards compatible with the standard tag.  Enhancements include support ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tfor URL template parameters.</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<name>url</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<tag-class>org.springframework.web.servlet.tags.UrlTag</tag-class>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<body-content>JSP</body-content>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<description>The URL to build.  This value can include template place holders ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tthat are replaced with the URL encoded value of the named parameter.  Parameters ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tmust be defined using the param tag inside the body of this tag.</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>value</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<required>true</required>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<rtexprvalue>true</rtexprvalue>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<description>Specifies a remote application context path.  The default is the ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tcurrent application context path.</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>context</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<required>false</required>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<rtexprvalue>true</rtexprvalue>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<description>The name of the variable to export the URL value to.</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>var</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<required>false</required>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<rtexprvalue>true</rtexprvalue>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<description>The scope for the var.  'application', 'session', 'request' and ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t'page' scopes are supported.  Defaults to page scope.  This attribute has no ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\teffect unless the var attribute is also defined.</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>scope</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<required>false</required>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<rtexprvalue>true</rtexprvalue>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<description>Set HTML escaping for this tag, as a boolean value. Overrides the");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tdefault HTML escaping setting for the current page.</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>htmlEscape</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<required>false</required>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<rtexprvalue>true</rtexprvalue>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<description>Set JavaScript escaping for this tag, as a boolean value.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tDefault is false.</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>javaScriptEscape</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<required>false</required>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<rtexprvalue>true</rtexprvalue>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</tag>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t<tag>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<description>Parameter tag based on the JSTL c:param tag.  The sole purpose is to ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tsupport params inside the spring:url tag.</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<name>param</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<tag-class>org.springframework.web.servlet.tags.ParamTag</tag-class>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<body-content>JSP</body-content>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<description>The name of the parameter.</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>name</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<required>true</required>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<rtexprvalue>true</rtexprvalue>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<description>The value of the parameter.</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>value</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<required>false</required>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<rtexprvalue>true</rtexprvalue>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</tag>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t<tag>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<description>Evaluates a Spring expression (SpEL) and either prints the result or assigns it to a variable.</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<name>eval</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<tag-class>org.springframework.web.servlet.tags.EvalTag</tag-class>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<body-content>JSP</body-content>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<description>The expression to evaluate.</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>expression</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<required>true</required>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<rtexprvalue>true</rtexprvalue>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<description>The name of the variable to export the evaluation result to.</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>var</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<required>false</required>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<rtexprvalue>true</rtexprvalue>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<description>The scope for the var.  'application', 'session', 'request' and ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t'page' scopes are supported.  Defaults to page scope.  This attribute has no ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\teffect unless the var attribute is also defined.</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>scope</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<required>false</required>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<rtexprvalue>true</rtexprvalue>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<description>Set HTML escaping for this tag, as a boolean value. Overrides the");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tdefault HTML escaping setting for the current page.</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>htmlEscape</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<required>false</required>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<rtexprvalue>true</rtexprvalue>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t<attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<description>Set JavaScript escaping for this tag, as a boolean value.  Default is false.</description>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<name>javaScriptEscape</name>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<required>false</required>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t<rtexprvalue>true</rtexprvalue>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t</attribute>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t</tag>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("</taglib>");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
