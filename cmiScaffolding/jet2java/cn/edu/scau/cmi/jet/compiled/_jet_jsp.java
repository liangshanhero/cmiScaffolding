package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_jsp implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_ws = "org.eclipse.jet.workspaceTags"; //$NON-NLS-1$

    public _jet_jsp() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_ws_file_4_1 = new TagInfo("ws:file", //$NON-NLS-1$
            4, 1,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/jsp/index.jet", //$NON-NLS-1$
                "{$projectName}/WebRoot/index.jsp", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_7_1 = new TagInfo("ws:file", //$NON-NLS-1$
            7, 1,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/jsp/menu/menu.jet", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/pages/menu.jsp", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_9_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            9, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$table", //$NON-NLS-1$
                "eachTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_10_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            10, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_11_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            11, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/columns/column", //$NON-NLS-1$
                "col", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_12_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            12, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$i+1", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_15_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            15, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_16_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            16, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/referenceds/referenced", //$NON-NLS-1$
                "ref", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_17_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            17, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$j+1", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_19_1 = new TagInfo("c:if", //$NON-NLS-1$
            19, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$i!=0 or $j!=0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_20_1 = new TagInfo("ws:file", //$NON-NLS-1$
            20, 1,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/jsp/menu.jet", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/pages/{$eachTable/@name}/menu.jsp", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_23_1 = new TagInfo("ws:file", //$NON-NLS-1$
            23, 1,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/jsp/view.jet", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/pages/{$eachTable/@name}/view{uppercaseFirst($eachTable/@name)}.jsp", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_26_1 = new TagInfo("ws:file", //$NON-NLS-1$
            26, 1,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/jsp/delete.jet", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/pages/{$eachTable/@name}/delete{uppercaseFirst($eachTable/@name)}.jsp", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_29_1 = new TagInfo("ws:file", //$NON-NLS-1$
            29, 1,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/jsp/list.jet", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/pages/{$eachTable/@name}/list{uppercaseFirst($eachTable/@name)}s.jsp", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_32_1 = new TagInfo("ws:file", //$NON-NLS-1$
            32, 1,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/jsp/edit.jet", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/pages/{$eachTable/@name}/edit{uppercaseFirst($eachTable/@name)}.jsp", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_35_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            35, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "x", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_36_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            36, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "y", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_37_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            37, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/columns/column", //$NON-NLS-1$
                "col", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_38_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            38, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$x+1", //$NON-NLS-1$
                "x", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_40_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            40, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/referenceds/referenced", //$NON-NLS-1$
                "ref", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_41_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            41, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$y+1", //$NON-NLS-1$
                "y", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_43_2 = new TagInfo("c:choose", //$NON-NLS-1$
            43, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_44_2 = new TagInfo("c:when", //$NON-NLS-1$
            44, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "($x!=0)or($y!=0)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_45_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            45, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/foreigns/column", //$NON-NLS-1$
                "foreign", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_46_3 = new TagInfo("c:setVariable", //$NON-NLS-1$
            46, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
                "relateTableName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_47_3 = new TagInfo("ws:file", //$NON-NLS-1$
            47, 3,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/jsp/viewRelate.jet", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/pages/{$eachTable/@name}/{$foreign/@referenceTable}/view{uppercaseFirst($foreign/@referenceTable)}.jsp", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_53_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            53, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/referenceds/referenced", //$NON-NLS-1$
                "referenced", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_54_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            54, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_55_3 = new TagInfo("c:if", //$NON-NLS-1$
            55, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/@name=$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_56_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            56, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_57_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            57, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_58_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            58, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/columns/column", //$NON-NLS-1$
                "col", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_59_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            59, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$i+1", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_61_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            61, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/referenceds/referenced", //$NON-NLS-1$
                "ref", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_62_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            62, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$j+1", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_64_4 = new TagInfo("c:if", //$NON-NLS-1$
            64, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$i=0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_65_4 = new TagInfo("c:if", //$NON-NLS-1$
            65, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$j=0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_66_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            66, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/foreigns/column", //$NON-NLS-1$
                "foreig", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_67_4 = new TagInfo("c:choose", //$NON-NLS-1$
            67, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_68_4 = new TagInfo("c:when", //$NON-NLS-1$
            68, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable=$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_70_4 = new TagInfo("c:otherwise", //$NON-NLS-1$
            70, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_setVariable_71_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            71, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$foreig/@referenceTable", //$NON-NLS-1$
                "relateTableName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_72_5 = new TagInfo("ws:file", //$NON-NLS-1$
            72, 5,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/jsp/viewRelate.jet", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/pages/{$eachTable/@name}/{$foreig/@referenceTable}s/view{uppercaseFirst($foreig/@referenceTable)}s.jsp", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_81_4 = new TagInfo("c:if", //$NON-NLS-1$
            81, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$j>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_82_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            82, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
                "relateTableName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_83_5 = new TagInfo("ws:file", //$NON-NLS-1$
            83, 5,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/jsp/viewRelate.jet", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/pages/{$eachTable/@name}/{$referenced/@name}s/view{uppercaseFirst($referenced/@name)}s.jsp", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_90_4 = new TagInfo("c:if", //$NON-NLS-1$
            90, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$i>0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_91_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            91, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenced/@name", //$NON-NLS-1$
                "relateTableName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_file_92_5 = new TagInfo("ws:file", //$NON-NLS-1$
            92, 5,
            new String[] {
                "template", //$NON-NLS-1$
                "path", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/jsp/viewRelate.jet", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/pages/{$eachTable/@name}/{$referenced/@name}s/view{uppercaseFirst($referenced/@name)}s.jsp", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_102_2 = new TagInfo("c:otherwise", //$NON-NLS-1$
            102, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_include_109_1 = new TagInfo("c:include", //$NON-NLS-1$
            109, 1,
            new String[] {
                "template", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/jsp/sitemesh/fileGenerate/fileGenerate.jet", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write(NL);         
        // 生成index.jsp 
        RuntimeTagElement _jettag_ws_file_4_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_4_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_file_4_1.setRuntimeParent(null);
        _jettag_ws_file_4_1.setTagInfo(_td_ws_file_4_1);
        _jettag_ws_file_4_1.doStart(context, out);
        _jettag_ws_file_4_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        // 生成menu.jsp 
        RuntimeTagElement _jettag_ws_file_7_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_7_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_file_7_1.setRuntimeParent(null);
        _jettag_ws_file_7_1.setTagInfo(_td_ws_file_7_1);
        _jettag_ws_file_7_1.doStart(context, out);
        _jettag_ws_file_7_1.doEnd();
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_9_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_9_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_9_1.setRuntimeParent(null);
        _jettag_c_iterate_9_1.setTagInfo(_td_c_iterate_9_1);
        _jettag_c_iterate_9_1.doStart(context, out);
        while (_jettag_c_iterate_9_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_10_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_10_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_10_1.setRuntimeParent(_jettag_c_iterate_9_1);
            _jettag_c_setVariable_10_1.setTagInfo(_td_c_setVariable_10_1);
            _jettag_c_setVariable_10_1.doStart(context, out);
            _jettag_c_setVariable_10_1.doEnd();
            RuntimeTagElement _jettag_c_iterate_11_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_11_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_11_1.setRuntimeParent(_jettag_c_iterate_9_1);
            _jettag_c_iterate_11_1.setTagInfo(_td_c_iterate_11_1);
            _jettag_c_iterate_11_1.doStart(context, out);
            while (_jettag_c_iterate_11_1.okToProcessBody()) {
                RuntimeTagElement _jettag_c_setVariable_12_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_12_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_12_1.setRuntimeParent(_jettag_c_iterate_11_1);
                _jettag_c_setVariable_12_1.setTagInfo(_td_c_setVariable_12_1);
                _jettag_c_setVariable_12_1.doStart(context, out);
                _jettag_c_setVariable_12_1.doEnd();
                _jettag_c_iterate_11_1.handleBodyContent(out);
            }
            _jettag_c_iterate_11_1.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_c_setVariable_15_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_15_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_15_1.setRuntimeParent(_jettag_c_iterate_9_1);
            _jettag_c_setVariable_15_1.setTagInfo(_td_c_setVariable_15_1);
            _jettag_c_setVariable_15_1.doStart(context, out);
            _jettag_c_setVariable_15_1.doEnd();
            RuntimeTagElement _jettag_c_iterate_16_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_16_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_16_1.setRuntimeParent(_jettag_c_iterate_9_1);
            _jettag_c_iterate_16_1.setTagInfo(_td_c_iterate_16_1);
            _jettag_c_iterate_16_1.doStart(context, out);
            while (_jettag_c_iterate_16_1.okToProcessBody()) {
                RuntimeTagElement _jettag_c_setVariable_17_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_17_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_17_1.setRuntimeParent(_jettag_c_iterate_16_1);
                _jettag_c_setVariable_17_1.setTagInfo(_td_c_setVariable_17_1);
                _jettag_c_setVariable_17_1.doStart(context, out);
                _jettag_c_setVariable_17_1.doEnd();
                _jettag_c_iterate_16_1.handleBodyContent(out);
            }
            _jettag_c_iterate_16_1.doEnd();
            RuntimeTagElement _jettag_c_if_19_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_19_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_19_1.setRuntimeParent(_jettag_c_iterate_9_1);
            _jettag_c_if_19_1.setTagInfo(_td_c_if_19_1);
            _jettag_c_if_19_1.doStart(context, out);
            while (_jettag_c_if_19_1.okToProcessBody()) {
                RuntimeTagElement _jettag_ws_file_20_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_20_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_file_20_1.setRuntimeParent(_jettag_c_if_19_1);
                _jettag_ws_file_20_1.setTagInfo(_td_ws_file_20_1);
                _jettag_ws_file_20_1.doStart(context, out);
                _jettag_ws_file_20_1.doEnd();
                out.write(NL);         
                out.write(NL);         
                // 生成view.jsp 
                RuntimeTagElement _jettag_ws_file_23_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_23_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_file_23_1.setRuntimeParent(_jettag_c_if_19_1);
                _jettag_ws_file_23_1.setTagInfo(_td_ws_file_23_1);
                _jettag_ws_file_23_1.doStart(context, out);
                _jettag_ws_file_23_1.doEnd();
                out.write(NL);         
                out.write(NL);         
                // 生成delete.jsp  
                RuntimeTagElement _jettag_ws_file_26_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_26_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_file_26_1.setRuntimeParent(_jettag_c_if_19_1);
                _jettag_ws_file_26_1.setTagInfo(_td_ws_file_26_1);
                _jettag_ws_file_26_1.doStart(context, out);
                _jettag_ws_file_26_1.doEnd();
                out.write(NL);         
                out.write(NL);         
                // 生成list.jsp  
                RuntimeTagElement _jettag_ws_file_29_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_29_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_file_29_1.setRuntimeParent(_jettag_c_if_19_1);
                _jettag_ws_file_29_1.setTagInfo(_td_ws_file_29_1);
                _jettag_ws_file_29_1.doStart(context, out);
                _jettag_ws_file_29_1.doEnd();
                out.write(NL);         
                out.write(NL);         
                // 生成edit.jsp  
                RuntimeTagElement _jettag_ws_file_32_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_32_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_ws_file_32_1.setRuntimeParent(_jettag_c_if_19_1);
                _jettag_ws_file_32_1.setTagInfo(_td_ws_file_32_1);
                _jettag_ws_file_32_1.doStart(context, out);
                _jettag_ws_file_32_1.doEnd();
                out.write(NL);         
                out.write(NL);         
                //生成关联实体的jsp页面
                RuntimeTagElement _jettag_c_setVariable_35_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_35_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_35_2.setRuntimeParent(_jettag_c_if_19_1);
                _jettag_c_setVariable_35_2.setTagInfo(_td_c_setVariable_35_2);
                _jettag_c_setVariable_35_2.doStart(context, out);
                _jettag_c_setVariable_35_2.doEnd();
                RuntimeTagElement _jettag_c_setVariable_36_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_36_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_36_2.setRuntimeParent(_jettag_c_if_19_1);
                _jettag_c_setVariable_36_2.setTagInfo(_td_c_setVariable_36_2);
                _jettag_c_setVariable_36_2.doStart(context, out);
                _jettag_c_setVariable_36_2.doEnd();
                RuntimeTagElement _jettag_c_iterate_37_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_37_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_37_2.setRuntimeParent(_jettag_c_if_19_1);
                _jettag_c_iterate_37_2.setTagInfo(_td_c_iterate_37_2);
                _jettag_c_iterate_37_2.doStart(context, out);
                while (_jettag_c_iterate_37_2.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_setVariable_38_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_38_3); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_38_3.setRuntimeParent(_jettag_c_iterate_37_2);
                    _jettag_c_setVariable_38_3.setTagInfo(_td_c_setVariable_38_3);
                    _jettag_c_setVariable_38_3.doStart(context, out);
                    _jettag_c_setVariable_38_3.doEnd();
                    _jettag_c_iterate_37_2.handleBodyContent(out);
                }
                _jettag_c_iterate_37_2.doEnd();
                RuntimeTagElement _jettag_c_iterate_40_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_40_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_40_2.setRuntimeParent(_jettag_c_if_19_1);
                _jettag_c_iterate_40_2.setTagInfo(_td_c_iterate_40_2);
                _jettag_c_iterate_40_2.doStart(context, out);
                while (_jettag_c_iterate_40_2.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_setVariable_41_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_41_3); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_41_3.setRuntimeParent(_jettag_c_iterate_40_2);
                    _jettag_c_setVariable_41_3.setTagInfo(_td_c_setVariable_41_3);
                    _jettag_c_setVariable_41_3.doStart(context, out);
                    _jettag_c_setVariable_41_3.doEnd();
                    _jettag_c_iterate_40_2.handleBodyContent(out);
                }
                _jettag_c_iterate_40_2.doEnd();
                RuntimeTagElement _jettag_c_choose_43_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_43_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_choose_43_2.setRuntimeParent(_jettag_c_if_19_1);
                _jettag_c_choose_43_2.setTagInfo(_td_c_choose_43_2);
                _jettag_c_choose_43_2.doStart(context, out);
                JET2Writer _jettag_c_choose_43_2_saved_out = out;
                while (_jettag_c_choose_43_2.okToProcessBody()) {
                    out = out.newNestedContentWriter();
                    RuntimeTagElement _jettag_c_when_44_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_44_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_when_44_2.setRuntimeParent(_jettag_c_choose_43_2);
                    _jettag_c_when_44_2.setTagInfo(_td_c_when_44_2);
                    _jettag_c_when_44_2.doStart(context, out);
                    JET2Writer _jettag_c_when_44_2_saved_out = out;
                    while (_jettag_c_when_44_2.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        RuntimeTagElement _jettag_c_iterate_45_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_45_2); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_iterate_45_2.setRuntimeParent(_jettag_c_when_44_2);
                        _jettag_c_iterate_45_2.setTagInfo(_td_c_iterate_45_2);
                        _jettag_c_iterate_45_2.doStart(context, out);
                        while (_jettag_c_iterate_45_2.okToProcessBody()) {
                            RuntimeTagElement _jettag_c_setVariable_46_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_46_3); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_setVariable_46_3.setRuntimeParent(_jettag_c_iterate_45_2);
                            _jettag_c_setVariable_46_3.setTagInfo(_td_c_setVariable_46_3);
                            _jettag_c_setVariable_46_3.doStart(context, out);
                            _jettag_c_setVariable_46_3.doEnd();
                            out.write("\t\t");  //$NON-NLS-1$        
                            RuntimeTagElement _jettag_ws_file_47_3 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_47_3); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_ws_file_47_3.setRuntimeParent(_jettag_c_iterate_45_2);
                            _jettag_ws_file_47_3.setTagInfo(_td_ws_file_47_3);
                            _jettag_ws_file_47_3.doStart(context, out);
                            _jettag_ws_file_47_3.doEnd();
                            out.write(NL);         
                            //<ws:file template="templates/content/jsp/deleteRelate.jet"  path="{$projectName}/WebRoot/WEB-INF/pages/{$eachTable/@name}/{$foreign/@referenceTable}/delete{uppercaseFirst($foreign/@referenceTable)}.jsp"/>
                            //		<ws:file template="templates/content/jsp/editRelate.jet"  path="{$projectName}/WebRoot/WEB-INF/pages/{$eachTable/@name}/{$foreign/@referenceTable}/edit{uppercaseFirst($foreign/@referenceTable)}.jsp"/>
                            //		
                            _jettag_c_iterate_45_2.handleBodyContent(out);
                        }
                        _jettag_c_iterate_45_2.doEnd();
                        out.write("\t");  //$NON-NLS-1$        
                        out.write(NL);         
                        RuntimeTagElement _jettag_c_iterate_53_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_53_2); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_iterate_53_2.setRuntimeParent(_jettag_c_when_44_2);
                        _jettag_c_iterate_53_2.setTagInfo(_td_c_iterate_53_2);
                        _jettag_c_iterate_53_2.doStart(context, out);
                        while (_jettag_c_iterate_53_2.okToProcessBody()) {
                            RuntimeTagElement _jettag_c_iterate_54_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_54_2); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_iterate_54_2.setRuntimeParent(_jettag_c_iterate_53_2);
                            _jettag_c_iterate_54_2.setTagInfo(_td_c_iterate_54_2);
                            _jettag_c_iterate_54_2.doStart(context, out);
                            while (_jettag_c_iterate_54_2.okToProcessBody()) {
                                RuntimeTagElement _jettag_c_if_55_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_55_3); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_if_55_3.setRuntimeParent(_jettag_c_iterate_54_2);
                                _jettag_c_if_55_3.setTagInfo(_td_c_if_55_3);
                                _jettag_c_if_55_3.doStart(context, out);
                                while (_jettag_c_if_55_3.okToProcessBody()) {
                                    RuntimeTagElement _jettag_c_setVariable_56_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_56_4); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_setVariable_56_4.setRuntimeParent(_jettag_c_if_55_3);
                                    _jettag_c_setVariable_56_4.setTagInfo(_td_c_setVariable_56_4);
                                    _jettag_c_setVariable_56_4.doStart(context, out);
                                    _jettag_c_setVariable_56_4.doEnd();
                                    RuntimeTagElement _jettag_c_setVariable_57_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_57_4); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_setVariable_57_4.setRuntimeParent(_jettag_c_if_55_3);
                                    _jettag_c_setVariable_57_4.setTagInfo(_td_c_setVariable_57_4);
                                    _jettag_c_setVariable_57_4.doStart(context, out);
                                    _jettag_c_setVariable_57_4.doEnd();
                                    RuntimeTagElement _jettag_c_iterate_58_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_58_4); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_iterate_58_4.setRuntimeParent(_jettag_c_if_55_3);
                                    _jettag_c_iterate_58_4.setTagInfo(_td_c_iterate_58_4);
                                    _jettag_c_iterate_58_4.doStart(context, out);
                                    while (_jettag_c_iterate_58_4.okToProcessBody()) {
                                        RuntimeTagElement _jettag_c_setVariable_59_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_59_5); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_setVariable_59_5.setRuntimeParent(_jettag_c_iterate_58_4);
                                        _jettag_c_setVariable_59_5.setTagInfo(_td_c_setVariable_59_5);
                                        _jettag_c_setVariable_59_5.doStart(context, out);
                                        _jettag_c_setVariable_59_5.doEnd();
                                        _jettag_c_iterate_58_4.handleBodyContent(out);
                                    }
                                    _jettag_c_iterate_58_4.doEnd();
                                    RuntimeTagElement _jettag_c_iterate_61_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_61_4); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_iterate_61_4.setRuntimeParent(_jettag_c_if_55_3);
                                    _jettag_c_iterate_61_4.setTagInfo(_td_c_iterate_61_4);
                                    _jettag_c_iterate_61_4.doStart(context, out);
                                    while (_jettag_c_iterate_61_4.okToProcessBody()) {
                                        RuntimeTagElement _jettag_c_setVariable_62_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_62_5); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_setVariable_62_5.setRuntimeParent(_jettag_c_iterate_61_4);
                                        _jettag_c_setVariable_62_5.setTagInfo(_td_c_setVariable_62_5);
                                        _jettag_c_setVariable_62_5.doStart(context, out);
                                        _jettag_c_setVariable_62_5.doEnd();
                                        _jettag_c_iterate_61_4.handleBodyContent(out);
                                    }
                                    _jettag_c_iterate_61_4.doEnd();
                                    RuntimeTagElement _jettag_c_if_64_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_64_4); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_if_64_4.setRuntimeParent(_jettag_c_if_55_3);
                                    _jettag_c_if_64_4.setTagInfo(_td_c_if_64_4);
                                    _jettag_c_if_64_4.doStart(context, out);
                                    while (_jettag_c_if_64_4.okToProcessBody()) {
                                        RuntimeTagElement _jettag_c_if_65_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_65_4); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_if_65_4.setRuntimeParent(_jettag_c_if_64_4);
                                        _jettag_c_if_65_4.setTagInfo(_td_c_if_65_4);
                                        _jettag_c_if_65_4.doStart(context, out);
                                        while (_jettag_c_if_65_4.okToProcessBody()) {
                                            RuntimeTagElement _jettag_c_iterate_66_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_66_4); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_iterate_66_4.setRuntimeParent(_jettag_c_if_65_4);
                                            _jettag_c_iterate_66_4.setTagInfo(_td_c_iterate_66_4);
                                            _jettag_c_iterate_66_4.doStart(context, out);
                                            while (_jettag_c_iterate_66_4.okToProcessBody()) {
                                                RuntimeTagElement _jettag_c_choose_67_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_67_4); //$NON-NLS-1$ //$NON-NLS-2$
                                                _jettag_c_choose_67_4.setRuntimeParent(_jettag_c_iterate_66_4);
                                                _jettag_c_choose_67_4.setTagInfo(_td_c_choose_67_4);
                                                _jettag_c_choose_67_4.doStart(context, out);
                                                JET2Writer _jettag_c_choose_67_4_saved_out = out;
                                                while (_jettag_c_choose_67_4.okToProcessBody()) {
                                                    out = out.newNestedContentWriter();
                                                    RuntimeTagElement _jettag_c_when_68_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_68_4); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_when_68_4.setRuntimeParent(_jettag_c_choose_67_4);
                                                    _jettag_c_when_68_4.setTagInfo(_td_c_when_68_4);
                                                    _jettag_c_when_68_4.doStart(context, out);
                                                    JET2Writer _jettag_c_when_68_4_saved_out = out;
                                                    while (_jettag_c_when_68_4.okToProcessBody()) {
                                                        out = out.newNestedContentWriter();
                                                        _jettag_c_when_68_4.handleBodyContent(out);
                                                    }
                                                    out = _jettag_c_when_68_4_saved_out;
                                                    _jettag_c_when_68_4.doEnd();
                                                    RuntimeTagElement _jettag_c_otherwise_70_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_70_4); //$NON-NLS-1$ //$NON-NLS-2$
                                                    _jettag_c_otherwise_70_4.setRuntimeParent(_jettag_c_choose_67_4);
                                                    _jettag_c_otherwise_70_4.setTagInfo(_td_c_otherwise_70_4);
                                                    _jettag_c_otherwise_70_4.doStart(context, out);
                                                    JET2Writer _jettag_c_otherwise_70_4_saved_out = out;
                                                    while (_jettag_c_otherwise_70_4.okToProcessBody()) {
                                                        out = out.newNestedContentWriter();
                                                        RuntimeTagElement _jettag_c_setVariable_71_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_71_5); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_c_setVariable_71_5.setRuntimeParent(_jettag_c_otherwise_70_4);
                                                        _jettag_c_setVariable_71_5.setTagInfo(_td_c_setVariable_71_5);
                                                        _jettag_c_setVariable_71_5.doStart(context, out);
                                                        _jettag_c_setVariable_71_5.doEnd();
                                                        out.write("\t\t\t\t");  //$NON-NLS-1$        
                                                        RuntimeTagElement _jettag_ws_file_72_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_72_5); //$NON-NLS-1$ //$NON-NLS-2$
                                                        _jettag_ws_file_72_5.setRuntimeParent(_jettag_c_otherwise_70_4);
                                                        _jettag_ws_file_72_5.setTagInfo(_td_ws_file_72_5);
                                                        _jettag_ws_file_72_5.doStart(context, out);
                                                        _jettag_ws_file_72_5.doEnd();
                                                        out.write(NL);         
                                                        //
                                                        //				<ws:file template="templates/content/jsp/deleteRelate.jet"  path="{$projectName}/WebRoot/WEB-INF/pages/{$eachTable/@name}/{$foreig/@referenceTable}s/delete{uppercaseFirst($foreig/@referenceTable)}s.jsp"/>
                                                        //				<ws:file template="templates/content/jsp/editRelate.jet"  path="{$projectName}/WebRoot/WEB-INF/pages/{$eachTable/@name}/{$foreig/@referenceTable}s/edit{uppercaseFirst($foreig/@referenceTable)}s.jsp"/>
                                                        //				
                                                        _jettag_c_otherwise_70_4.handleBodyContent(out);
                                                    }
                                                    out = _jettag_c_otherwise_70_4_saved_out;
                                                    _jettag_c_otherwise_70_4.doEnd();
                                                    _jettag_c_choose_67_4.handleBodyContent(out);
                                                }
                                                out = _jettag_c_choose_67_4_saved_out;
                                                _jettag_c_choose_67_4.doEnd();
                                                _jettag_c_iterate_66_4.handleBodyContent(out);
                                            }
                                            _jettag_c_iterate_66_4.doEnd();
                                            _jettag_c_if_65_4.handleBodyContent(out);
                                        }
                                        _jettag_c_if_65_4.doEnd();
                                        RuntimeTagElement _jettag_c_if_81_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_81_4); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_if_81_4.setRuntimeParent(_jettag_c_if_64_4);
                                        _jettag_c_if_81_4.setTagInfo(_td_c_if_81_4);
                                        _jettag_c_if_81_4.doStart(context, out);
                                        while (_jettag_c_if_81_4.okToProcessBody()) {
                                            RuntimeTagElement _jettag_c_setVariable_82_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_82_5); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_c_setVariable_82_5.setRuntimeParent(_jettag_c_if_81_4);
                                            _jettag_c_setVariable_82_5.setTagInfo(_td_c_setVariable_82_5);
                                            _jettag_c_setVariable_82_5.doStart(context, out);
                                            _jettag_c_setVariable_82_5.doEnd();
                                            out.write("\t\t\t\t");  //$NON-NLS-1$        
                                            RuntimeTagElement _jettag_ws_file_83_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_83_5); //$NON-NLS-1$ //$NON-NLS-2$
                                            _jettag_ws_file_83_5.setRuntimeParent(_jettag_c_if_81_4);
                                            _jettag_ws_file_83_5.setTagInfo(_td_ws_file_83_5);
                                            _jettag_ws_file_83_5.doStart(context, out);
                                            _jettag_ws_file_83_5.doEnd();
                                            out.write(NL);         
                                            //
                                            //				<ws:file template="templates/content/jsp/deleteRelate.jet"  path="{$projectName}/WebRoot/WEB-INF/pages/{$eachTable/@name}/{$referenced/@name}s/delete{uppercaseFirst($referenced/@name)}s.jsp"/>
                                            //				<ws:file template="templates/content/jsp/editRelate.jet"  path="{$projectName}/WebRoot/WEB-INF/pages/{$eachTable/@name}/{$referenced/@name}s/edit{uppercaseFirst($referenced/@name)}s.jsp"/>
                                            //				
                                            _jettag_c_if_81_4.handleBodyContent(out);
                                        }
                                        _jettag_c_if_81_4.doEnd();
                                        _jettag_c_if_64_4.handleBodyContent(out);
                                    }
                                    _jettag_c_if_64_4.doEnd();
                                    RuntimeTagElement _jettag_c_if_90_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_90_4); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_if_90_4.setRuntimeParent(_jettag_c_if_55_3);
                                    _jettag_c_if_90_4.setTagInfo(_td_c_if_90_4);
                                    _jettag_c_if_90_4.doStart(context, out);
                                    while (_jettag_c_if_90_4.okToProcessBody()) {
                                        RuntimeTagElement _jettag_c_setVariable_91_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_91_5); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_c_setVariable_91_5.setRuntimeParent(_jettag_c_if_90_4);
                                        _jettag_c_setVariable_91_5.setTagInfo(_td_c_setVariable_91_5);
                                        _jettag_c_setVariable_91_5.doStart(context, out);
                                        _jettag_c_setVariable_91_5.doEnd();
                                        out.write("\t\t\t\t");  //$NON-NLS-1$        
                                        RuntimeTagElement _jettag_ws_file_92_5 = context.getTagFactory().createRuntimeTag(_jetns_ws, "file", "ws:file", _td_ws_file_92_5); //$NON-NLS-1$ //$NON-NLS-2$
                                        _jettag_ws_file_92_5.setRuntimeParent(_jettag_c_if_90_4);
                                        _jettag_ws_file_92_5.setTagInfo(_td_ws_file_92_5);
                                        _jettag_ws_file_92_5.doStart(context, out);
                                        _jettag_ws_file_92_5.doEnd();
                                        out.write(NL);         
                                        //
                                        //				<ws:file template="templates/content/jsp/deleteRelate.jet"  path="{$projectName}/WebRoot/WEB-INF/pages/{$eachTable/@name}/{$referenced/@name}s/delete{uppercaseFirst($referenced/@name)}s.jsp"/>
                                        //				<ws:file template="templates/content/jsp/editRelate.jet"  path="{$projectName}/WebRoot/WEB-INF/pages/{$eachTable/@name}/{$referenced/@name}s/edit{uppercaseFirst($referenced/@name)}s.jsp"/>
                                        //				
                                        _jettag_c_if_90_4.handleBodyContent(out);
                                    }
                                    _jettag_c_if_90_4.doEnd();
                                    _jettag_c_if_55_3.handleBodyContent(out);
                                }
                                _jettag_c_if_55_3.doEnd();
                                _jettag_c_iterate_54_2.handleBodyContent(out);
                            }
                            _jettag_c_iterate_54_2.doEnd();
                            _jettag_c_iterate_53_2.handleBodyContent(out);
                        }
                        _jettag_c_iterate_53_2.doEnd();
                        _jettag_c_when_44_2.handleBodyContent(out);
                    }
                    out = _jettag_c_when_44_2_saved_out;
                    _jettag_c_when_44_2.doEnd();
                    RuntimeTagElement _jettag_c_otherwise_102_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_102_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_otherwise_102_2.setRuntimeParent(_jettag_c_choose_43_2);
                    _jettag_c_otherwise_102_2.setTagInfo(_td_c_otherwise_102_2);
                    _jettag_c_otherwise_102_2.doStart(context, out);
                    JET2Writer _jettag_c_otherwise_102_2_saved_out = out;
                    while (_jettag_c_otherwise_102_2.okToProcessBody()) {
                        out = out.newNestedContentWriter();
                        _jettag_c_otherwise_102_2.handleBodyContent(out);
                    }
                    out = _jettag_c_otherwise_102_2_saved_out;
                    _jettag_c_otherwise_102_2.doEnd();
                    _jettag_c_choose_43_2.handleBodyContent(out);
                }
                out = _jettag_c_choose_43_2_saved_out;
                _jettag_c_choose_43_2.doEnd();
                out.write("\t");  //$NON-NLS-1$        
                out.write(NL);         
                _jettag_c_if_19_1.handleBodyContent(out);
            }
            _jettag_c_if_19_1.doEnd();
            _jettag_c_iterate_9_1.handleBodyContent(out);
        }
        _jettag_c_iterate_9_1.doEnd();
        // 生成修饰jsp 
        RuntimeTagElement _jettag_c_include_109_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "include", "c:include", _td_c_include_109_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_include_109_1.setRuntimeParent(null);
        _jettag_c_include_109_1.setTagInfo(_td_c_include_109_1);
        _jettag_c_include_109_1.doStart(context, out);
        _jettag_c_include_109_1.doEnd();
    }
}
