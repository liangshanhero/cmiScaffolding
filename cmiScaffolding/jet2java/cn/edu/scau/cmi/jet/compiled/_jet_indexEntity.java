package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_indexEntity implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$

    public _jet_indexEntity() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_1_25 = new TagInfo("c:get", //$NON-NLS-1$
            1, 25,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_2_26 = new TagInfo("c:get", //$NON-NLS-1$
            2, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_import_2_78 = new TagInfo("java:import", //$NON-NLS-1$
            2, 78,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_4_17 = new TagInfo("c:get", //$NON-NLS-1$
            4, 17,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_4_64 = new TagInfo("c:get", //$NON-NLS-1$
            4, 64,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_19 = new TagInfo("c:get", //$NON-NLS-1$
            23, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_23_66 = new TagInfo("c:get", //$NON-NLS-1$
            23, 66,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_19 = new TagInfo("c:get", //$NON-NLS-1$
            29, 19,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_57 = new TagInfo("c:get", //$NON-NLS-1$
            29, 57,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_103 = new TagInfo("c:get", //$NON-NLS-1$
            29, 103,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_34_20 = new TagInfo("c:get", //$NON-NLS-1$
            34, 20,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_34_59 = new TagInfo("c:get", //$NON-NLS-1$
            34, 59,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_38_21 = new TagInfo("c:get", //$NON-NLS-1$
            38, 21,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_39_26 = new TagInfo("c:get", //$NON-NLS-1$
            39, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("\t@RequestMapping(\"/index");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_1_25 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_1_25); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_1_25.setRuntimeParent(null);
        _jettag_c_get_1_25.setTagInfo(_td_c_get_1_25);
        _jettag_c_get_1_25.doStart(context, out);
        _jettag_c_get_1_25.doEnd();
        out.write("\")");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic ModelAndView list");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_2_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_2_26); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_2_26.setRuntimeParent(null);
        _jettag_c_get_2_26.setTagInfo(_td_c_get_2_26);
        _jettag_c_get_2_26.doStart(context, out);
        _jettag_c_get_2_26.doEnd();
        out.write("s(");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_java_import_2_78 = context.getTagFactory().createRuntimeTag(_jetns_java, "import", "java:import", _td_java_import_2_78); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_import_2_78.setRuntimeParent(null);
        _jettag_java_import_2_78.setTagInfo(_td_java_import_2_78);
        _jettag_java_import_2_78.doStart(context, out);
        JET2Writer _jettag_java_import_2_78_saved_out = out;
        while (_jettag_java_import_2_78.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("javax.servlet.http.HttpServletRequest");  //$NON-NLS-1$        
            _jettag_java_import_2_78.handleBodyContent(out);
        }
        out = _jettag_java_import_2_78_saved_out;
        _jettag_java_import_2_78.doEnd();
        out.write(" request) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tModelAndView mav = new ModelAndView();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tint totalPage=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_4_17 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_4_17); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_4_17.setRuntimeParent(null);
        _jettag_c_get_4_17.setTagInfo(_td_c_get_4_17);
        _jettag_c_get_4_17.doStart(context, out);
        _jettag_c_get_4_17.doEnd();
        out.write("Service.count");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_4_64 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_4_64); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_4_64.setRuntimeParent(null);
        _jettag_c_get_4_64.setTagInfo(_td_c_get_4_64);
        _jettag_c_get_4_64.doStart(context, out);
        _jettag_c_get_4_64.doEnd();
        out.write("s()/pageSize;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tString pageType = null;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tString sessionAttribute=(String) request.getSession().getAttribute(\"page\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tString requestAttribute=request.getParameter(\"page\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif(sessionAttribute!=null)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tpageType=sessionAttribute;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif(requestAttribute!=null)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tpageType = requestAttribute;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tswitch (pageType){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tcase \"homePage\":pageNumber=0;break;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tcase \"previousPage\":if(pageNumber>=1)pageNumber=pageNumber-1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\telse pageNumber=0;break;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tcase \"nextPage\":if(pageNumber<totalPage)pageNumber=pageNumber+1;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\telse pageNumber=totalPage;break;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tcase \"lastPage\":pageNumber=totalPage;break;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tcase \"jumpPage\":pageNumber=Integer.parseInt(request.getParameter(\"WantToPage\"))-1;break;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tcase \"eachPageShow\":pageNumber=0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\tpageSize=Integer.parseInt(request.getParameter(\"pageSize\"));");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\ttotalPage=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_23_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_19); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_23_19.setRuntimeParent(null);
        _jettag_c_get_23_19.setTagInfo(_td_c_get_23_19);
        _jettag_c_get_23_19.doStart(context, out);
        _jettag_c_get_23_19.doEnd();
        out.write("Service.count");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_23_66 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_23_66); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_23_66.setRuntimeParent(null);
        _jettag_c_get_23_66.setTagInfo(_td_c_get_23_66);
        _jettag_c_get_23_66.doStart(context, out);
        _jettag_c_get_23_66.doEnd();
        out.write("s()/pageSize;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t\tbreak;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tdefault:");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tSystem.out.println(\"error input!\");\tbreak;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif(pageNumber>=0&&pageNumber<=totalPage)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tmav.addObject(\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_29_19 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_19); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_29_19.setRuntimeParent(null);
        _jettag_c_get_29_19.setTagInfo(_td_c_get_29_19);
        _jettag_c_get_29_19.doStart(context, out);
        _jettag_c_get_29_19.doEnd();
        out.write("s\", ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_29_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_57); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_29_57.setRuntimeParent(null);
        _jettag_c_get_29_57.setTagInfo(_td_c_get_29_57);
        _jettag_c_get_29_57.doStart(context, out);
        _jettag_c_get_29_57.doEnd();
        out.write("Service.load");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_29_103 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_103); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_29_103.setRuntimeParent(null);
        _jettag_c_get_29_103.setTagInfo(_td_c_get_29_103);
        _jettag_c_get_29_103.doStart(context, out);
        _jettag_c_get_29_103.doEnd();
        out.write("s(pageNumber*pageSize,pageSize));\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tmav.addObject(\"totalPage\", totalPage);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tmav.addObject(\"prePageSize\", pageSize);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tmav.addObject(\"prePage\", pageNumber);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tmav.setViewName(\"");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_34_20 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_34_20); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_34_20.setRuntimeParent(null);
        _jettag_c_get_34_20.setTagInfo(_td_c_get_34_20);
        _jettag_c_get_34_20.doStart(context, out);
        _jettag_c_get_34_20.doEnd();
        out.write("/list");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_34_59 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_34_59); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_34_59.setRuntimeParent(null);
        _jettag_c_get_34_59.setTagInfo(_td_c_get_34_59);
        _jettag_c_get_34_59.doStart(context, out);
        _jettag_c_get_34_59.doEnd();
        out.write("s.jsp\");");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn mav;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic String index");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_38_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_38_21); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_38_21.setRuntimeParent(null);
        _jettag_c_get_38_21.setTagInfo(_td_c_get_38_21);
        _jettag_c_get_38_21.doStart(context, out);
        _jettag_c_get_38_21.doEnd();
        out.write("() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn \"redirect:/index");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_39_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_39_26); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_39_26.setRuntimeParent(null);
        _jettag_c_get_39_26.setTagInfo(_td_c_get_39_26);
        _jettag_c_get_39_26.doStart(context, out);
        _jettag_c_get_39_26.doEnd();
        out.write("\";");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
    }
}
