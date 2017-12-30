package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_equals implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_equals() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_4_24 = new TagInfo("c:get", //$NON-NLS-1$
            4, 24,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_3 = new TagInfo("c:get", //$NON-NLS-1$
            6, 3,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_68 = new TagInfo("c:get", //$NON-NLS-1$
            6, 68,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_7_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            7, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_8 = new TagInfo("c:get", //$NON-NLS-1$
            8, 8,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_82 = new TagInfo("c:get", //$NON-NLS-1$
            8, 82,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_147 = new TagInfo("c:get", //$NON-NLS-1$
            8, 147,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_221 = new TagInfo("c:get", //$NON-NLS-1$
            8, 221,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_11_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            11, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "primaryKey", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_7 = new TagInfo("c:get", //$NON-NLS-1$
            12, 7,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_70 = new TagInfo("c:get", //$NON-NLS-1$
            12, 70,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_140 = new TagInfo("c:get", //$NON-NLS-1$
            12, 140,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "lowercaseFirst($primaryKey/@name)", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("public boolean equals(Object obj) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif (obj == this)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn true;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif (!(obj instanceof ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_4_24 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_4_24); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_4_24.setRuntimeParent(null);
        _jettag_c_get_4_24.setTagInfo(_td_c_get_4_24);
        _jettag_c_get_4_24.doStart(context, out);
        _jettag_c_get_4_24.doEnd();
        out.write("))");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn false;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_6_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_6_3.setRuntimeParent(null);
        _jettag_c_get_6_3.setTagInfo(_td_c_get_6_3);
        _jettag_c_get_6_3.doStart(context, out);
        _jettag_c_get_6_3.doEnd();
        out.write(" equalCheck = (");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_6_68 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_68); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_6_68.setRuntimeParent(null);
        _jettag_c_get_6_68.setTagInfo(_td_c_get_6_68);
        _jettag_c_get_6_68.doStart(context, out);
        _jettag_c_get_6_68.doEnd();
        out.write(") obj;");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_7_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_7_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_7_3.setRuntimeParent(null);
        _jettag_c_iterate_7_3.setTagInfo(_td_c_iterate_7_3);
        _jettag_c_iterate_7_3.doStart(context, out);
        while (_jettag_c_iterate_7_3.okToProcessBody()) {
            out.write("\t\tif ((");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_8_8 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_8); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_8_8.setRuntimeParent(_jettag_c_iterate_7_3);
            _jettag_c_get_8_8.setTagInfo(_td_c_get_8_8);
            _jettag_c_get_8_8.doStart(context, out);
            _jettag_c_get_8_8.doEnd();
            out.write(" == null && equalCheck.");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_8_82 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_82); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_8_82.setRuntimeParent(_jettag_c_iterate_7_3);
            _jettag_c_get_8_82.setTagInfo(_td_c_get_8_82);
            _jettag_c_get_8_82.doStart(context, out);
            _jettag_c_get_8_82.doEnd();
            out.write(" != null) || (");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_8_147 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_147); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_8_147.setRuntimeParent(_jettag_c_iterate_7_3);
            _jettag_c_get_8_147.setTagInfo(_td_c_get_8_147);
            _jettag_c_get_8_147.doStart(context, out);
            _jettag_c_get_8_147.doEnd();
            out.write(" != null && equalCheck.");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_8_221 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_221); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_8_221.setRuntimeParent(_jettag_c_iterate_7_3);
            _jettag_c_get_8_221.setTagInfo(_td_c_get_8_221);
            _jettag_c_get_8_221.doStart(context, out);
            _jettag_c_get_8_221.doEnd();
            out.write(" == null))");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\treturn false;");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_7_3.handleBodyContent(out);
        }
        _jettag_c_iterate_7_3.doEnd();
        RuntimeTagElement _jettag_c_iterate_11_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_11_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_11_3.setRuntimeParent(null);
        _jettag_c_iterate_11_3.setTagInfo(_td_c_iterate_11_3);
        _jettag_c_iterate_11_3.doStart(context, out);
        while (_jettag_c_iterate_11_3.okToProcessBody()) {
            out.write("\t\tif (");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_12_7 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_7); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_12_7.setRuntimeParent(_jettag_c_iterate_11_3);
            _jettag_c_get_12_7.setTagInfo(_td_c_get_12_7);
            _jettag_c_get_12_7.doStart(context, out);
            _jettag_c_get_12_7.doEnd();
            out.write("!= null && !");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_12_70 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_70); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_12_70.setRuntimeParent(_jettag_c_iterate_11_3);
            _jettag_c_get_12_70.setTagInfo(_td_c_get_12_70);
            _jettag_c_get_12_70.doStart(context, out);
            _jettag_c_get_12_70.doEnd();
            out.write(".equals(equalCheck.");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_12_140 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_140); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_12_140.setRuntimeParent(_jettag_c_iterate_11_3);
            _jettag_c_get_12_140.setTagInfo(_td_c_get_12_140);
            _jettag_c_get_12_140.doStart(context, out);
            _jettag_c_get_12_140.doEnd();
            out.write("))");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\treturn false;");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_11_3.handleBodyContent(out);
        }
        _jettag_c_iterate_11_3.doEnd();
        out.write("\t\treturn true;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
    }
}
