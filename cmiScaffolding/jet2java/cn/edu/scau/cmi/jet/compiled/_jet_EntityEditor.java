package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;

public class _jet_EntityEditor implements JET2Template {

    public _jet_EntityEditor() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("package cn.edu.scau.cmi.liangzaoqing.initbinder;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("import java.beans.PropertyEditorSupport;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import java.math.BigDecimal;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import java.util.HashSet;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import java.util.Set;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("import org.springframework.beans.factory.annotation.Autowired;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import org.springframework.stereotype.Component;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("import cn.edu.scau.cmi.liangzaoqing.dao.TeacherDAO;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import cn.edu.scau.cmi.liangzaoqing.domain.Teacher;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("//封装Teacher的teachers属性");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("@Component(\"TeachersEditor\")");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("public class TeachersEditor extends PropertyEditorSupport{");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t/*需要spring注入*/");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("//\t@Autowired");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("//\tprivate SxEdkzDAO sxEdkzDAO;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("//\t@Autowired");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("//\tprivate SxEdkzDetailDAO sxEdkzDetailDAO;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("//\t@Autowired");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("//\tprivate ZwXmedkzDAO zwXmedkzDAO;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("//\t@Autowired");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("//\tprivate ZwxmedzdDAO zwxmedzdDAO;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t@Autowired");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate TeacherDAO teacherDAO;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("//\t将页面传入的offices属性（String类型）封装成office集合");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic void setAsText(String teachers ){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("//\t\t项目额度明细集合，开始为空，最后将页面的输入依次添加进入，");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("//\t\tSxEdkz sxEdkz=new SxEdkz();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tSet<Teacher> teacherSet=new HashSet<Teacher>();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("//\t\t将页面中传来的值分拆，每一部分在封装为一个额度控制明细对象，再将这个额度控制明细对象添加到集合中");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tString[] teacherIdStringSet = teachers.split(\",\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tfor(String teacherIdString:teacherIdStringSet){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tTeacher teacher=teacherDAO.findTeacherById(Integer.parseInt(teacherIdString));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tteacherSet.add(teacher);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tsetValue(teacherSet);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
