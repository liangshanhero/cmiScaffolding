package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_copy implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_copy() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_1_18 = new TagInfo("c:get", //$NON-NLS-1$
            1, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_2_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            2, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/primaryKeys/column", //$NON-NLS-1$
                "p", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_3_6 = new TagInfo("c:get", //$NON-NLS-1$
            3, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($p/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_3_57 = new TagInfo("c:get", //$NON-NLS-1$
            3, 57,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($p/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_5_3 = new TagInfo("c:iterate", //$NON-NLS-1$
            5, 3,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/columns/column", //$NON-NLS-1$
                "c", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_6 = new TagInfo("c:get", //$NON-NLS-1$
            6, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($c/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_57 = new TagInfo("c:get", //$NON-NLS-1$
            6, 57,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($c/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_8_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            8, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/referenceds/referenced", //$NON-NLS-1$
                "r", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_9_2 = new TagInfo("c:setVariable", //$NON-NLS-1$
            9, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$r/@name", //$NON-NLS-1$
                "preTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_10_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            10, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$project/model/dataBaseType/tables/table", //$NON-NLS-1$
                "t", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_11_2 = new TagInfo("c:if", //$NON-NLS-1$
            11, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$t/@name=$preTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_12_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            12, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$t/foreigns/column", //$NON-NLS-1$
                "c", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_13_2 = new TagInfo("c:choose", //$NON-NLS-1$
            13, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_14_2 = new TagInfo("c:when", //$NON-NLS-1$
            14, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$c/@referenceTable=$table/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_16_2 = new TagInfo("c:otherwise", //$NON-NLS-1$
            16, 2,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_17_6 = new TagInfo("c:get", //$NON-NLS-1$
            17, 6,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($c/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_88 = new TagInfo("c:get", //$NON-NLS-1$
            17, 88,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$packageName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_126 = new TagInfo("c:get", //$NON-NLS-1$
            17, 126,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($c/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_17_188 = new TagInfo("c:get", //$NON-NLS-1$
            17, 188,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($c/@referenceTable)", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("public void copy(");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_1_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_1_18); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_1_18.setRuntimeParent(null);
        _jettag_c_get_1_18.setTagInfo(_td_c_get_1_18);
        _jettag_c_get_1_18.doStart(context, out);
        _jettag_c_get_1_18.doEnd();
        out.write(" that) {");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_2_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_2_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_2_3.setRuntimeParent(null);
        _jettag_c_iterate_2_3.setTagInfo(_td_c_iterate_2_3);
        _jettag_c_iterate_2_3.doStart(context, out);
        while (_jettag_c_iterate_2_3.okToProcessBody()) {
            out.write("\t\tset");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_3_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_3_6.setRuntimeParent(_jettag_c_iterate_2_3);
            _jettag_c_get_3_6.setTagInfo(_td_c_get_3_6);
            _jettag_c_get_3_6.doStart(context, out);
            _jettag_c_get_3_6.doEnd();
            out.write("(that.get");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_3_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_3_57); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_3_57.setRuntimeParent(_jettag_c_iterate_2_3);
            _jettag_c_get_3_57.setTagInfo(_td_c_get_3_57);
            _jettag_c_get_3_57.doStart(context, out);
            _jettag_c_get_3_57.doEnd();
            out.write("());");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_2_3.handleBodyContent(out);
        }
        _jettag_c_iterate_2_3.doEnd();
        RuntimeTagElement _jettag_c_iterate_5_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_5_3); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_5_3.setRuntimeParent(null);
        _jettag_c_iterate_5_3.setTagInfo(_td_c_iterate_5_3);
        _jettag_c_iterate_5_3.doStart(context, out);
        while (_jettag_c_iterate_5_3.okToProcessBody()) {
            out.write("\t\tset");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_6_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_6); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_6_6.setRuntimeParent(_jettag_c_iterate_5_3);
            _jettag_c_get_6_6.setTagInfo(_td_c_get_6_6);
            _jettag_c_get_6_6.doStart(context, out);
            _jettag_c_get_6_6.doEnd();
            out.write("(that.get");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_6_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_57); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_6_57.setRuntimeParent(_jettag_c_iterate_5_3);
            _jettag_c_get_6_57.setTagInfo(_td_c_get_6_57);
            _jettag_c_get_6_57.doStart(context, out);
            _jettag_c_get_6_57.doEnd();
            out.write("());");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_iterate_5_3.handleBodyContent(out);
        }
        _jettag_c_iterate_5_3.doEnd();
        RuntimeTagElement _jettag_c_iterate_8_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_8_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_8_2.setRuntimeParent(null);
        _jettag_c_iterate_8_2.setTagInfo(_td_c_iterate_8_2);
        _jettag_c_iterate_8_2.doStart(context, out);
        while (_jettag_c_iterate_8_2.okToProcessBody()) {
            RuntimeTagElement _jettag_c_setVariable_9_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_9_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_setVariable_9_2.setRuntimeParent(_jettag_c_iterate_8_2);
            _jettag_c_setVariable_9_2.setTagInfo(_td_c_setVariable_9_2);
            _jettag_c_setVariable_9_2.doStart(context, out);
            _jettag_c_setVariable_9_2.doEnd();
            RuntimeTagElement _jettag_c_iterate_10_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_10_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_10_2.setRuntimeParent(_jettag_c_iterate_8_2);
            _jettag_c_iterate_10_2.setTagInfo(_td_c_iterate_10_2);
            _jettag_c_iterate_10_2.doStart(context, out);
            while (_jettag_c_iterate_10_2.okToProcessBody()) {
                RuntimeTagElement _jettag_c_if_11_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_11_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_11_2.setRuntimeParent(_jettag_c_iterate_10_2);
                _jettag_c_if_11_2.setTagInfo(_td_c_if_11_2);
                _jettag_c_if_11_2.doStart(context, out);
                while (_jettag_c_if_11_2.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_iterate_12_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_12_2); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_12_2.setRuntimeParent(_jettag_c_if_11_2);
                    _jettag_c_iterate_12_2.setTagInfo(_td_c_iterate_12_2);
                    _jettag_c_iterate_12_2.doStart(context, out);
                    while (_jettag_c_iterate_12_2.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_choose_13_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_13_2); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_choose_13_2.setRuntimeParent(_jettag_c_iterate_12_2);
                        _jettag_c_choose_13_2.setTagInfo(_td_c_choose_13_2);
                        _jettag_c_choose_13_2.doStart(context, out);
                        JET2Writer _jettag_c_choose_13_2_saved_out = out;
                        while (_jettag_c_choose_13_2.okToProcessBody()) {
                            out = out.newNestedContentWriter();
                            RuntimeTagElement _jettag_c_when_14_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_14_2); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_when_14_2.setRuntimeParent(_jettag_c_choose_13_2);
                            _jettag_c_when_14_2.setTagInfo(_td_c_when_14_2);
                            _jettag_c_when_14_2.doStart(context, out);
                            JET2Writer _jettag_c_when_14_2_saved_out = out;
                            while (_jettag_c_when_14_2.okToProcessBody()) {
                                out = out.newNestedContentWriter();
                                _jettag_c_when_14_2.handleBodyContent(out);
                            }
                            out = _jettag_c_when_14_2_saved_out;
                            _jettag_c_when_14_2.doEnd();
                            RuntimeTagElement _jettag_c_otherwise_16_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_16_2); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_otherwise_16_2.setRuntimeParent(_jettag_c_choose_13_2);
                            _jettag_c_otherwise_16_2.setTagInfo(_td_c_otherwise_16_2);
                            _jettag_c_otherwise_16_2.doStart(context, out);
                            JET2Writer _jettag_c_otherwise_16_2_saved_out = out;
                            while (_jettag_c_otherwise_16_2.okToProcessBody()) {
                                out = out.newNestedContentWriter();
                                out.write("\t\tset");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_17_6 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_6); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_17_6.setRuntimeParent(_jettag_c_otherwise_16_2);
                                _jettag_c_get_17_6.setTagInfo(_td_c_get_17_6);
                                _jettag_c_get_17_6.doStart(context, out);
                                _jettag_c_get_17_6.doEnd();
                                out.write("s(new java.util.LinkedHashSet<");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_17_88 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_88); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_17_88.setRuntimeParent(_jettag_c_otherwise_16_2);
                                _jettag_c_get_17_88.setTagInfo(_td_c_get_17_88);
                                _jettag_c_get_17_88.doStart(context, out);
                                _jettag_c_get_17_88.doEnd();
                                out.write(".domain.");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_17_126 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_126); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_17_126.setRuntimeParent(_jettag_c_otherwise_16_2);
                                _jettag_c_get_17_126.setTagInfo(_td_c_get_17_126);
                                _jettag_c_get_17_126.doStart(context, out);
                                _jettag_c_get_17_126.doEnd();
                                out.write(">(that.get");  //$NON-NLS-1$        
                                RuntimeTagElement _jettag_c_get_17_188 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_17_188); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_get_17_188.setRuntimeParent(_jettag_c_otherwise_16_2);
                                _jettag_c_get_17_188.setTagInfo(_td_c_get_17_188);
                                _jettag_c_get_17_188.doStart(context, out);
                                _jettag_c_get_17_188.doEnd();
                                out.write("s()));");  //$NON-NLS-1$        
                                out.write(NL);         
                                _jettag_c_otherwise_16_2.handleBodyContent(out);
                            }
                            out = _jettag_c_otherwise_16_2_saved_out;
                            _jettag_c_otherwise_16_2.doEnd();
                            _jettag_c_choose_13_2.handleBodyContent(out);
                        }
                        out = _jettag_c_choose_13_2_saved_out;
                        _jettag_c_choose_13_2.doEnd();
                        _jettag_c_iterate_12_2.handleBodyContent(out);
                    }
                    _jettag_c_iterate_12_2.doEnd();
                    _jettag_c_if_11_2.handleBodyContent(out);
                }
                _jettag_c_if_11_2.doEnd();
                _jettag_c_iterate_10_2.handleBodyContent(out);
            }
            _jettag_c_iterate_10_2.doEnd();
            _jettag_c_iterate_8_2.handleBodyContent(out);
        }
        _jettag_c_iterate_8_2.doEnd();
        out.write("\t}");  //$NON-NLS-1$        
    }
}
