package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_countEntity_0 implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_countEntity_0() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_1_21 = new TagInfo("c:get", //$NON-NLS-1$
            1, 21,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_3_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            3, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/foreigns/column", //$NON-NLS-1$
                "foreign", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_4_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            4, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "existTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_5_2 = new TagInfo("c:if", //$NON-NLS-1$
            5, 2,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable=$existTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_30 = new TagInfo("c:get", //$NON-NLS-1$
            6, 30,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($foreign/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_88 = new TagInfo("c:get", //$NON-NLS-1$
            6, 88,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_6_148 = new TagInfo("c:get", //$NON-NLS-1$
            6, 148,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$foreign/@referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_11_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            11, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/referenceds/referenced", //$NON-NLS-1$
                "referenced", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_12_2 = new TagInfo("c:iterate", //$NON-NLS-1$
            12, 2,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTables/table", //$NON-NLS-1$
                "referenceTable", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_13_3 = new TagInfo("c:if", //$NON-NLS-1$
            13, 3,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/@name=$referenced/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_14_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            14, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_15_4 = new TagInfo("c:setVariable", //$NON-NLS-1$
            15, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_16_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            16, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/columns/column", //$NON-NLS-1$
                "col", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_17_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            17, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$i+1", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_19_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            19, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/referenceds/referenced", //$NON-NLS-1$
                "ref", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_20_5 = new TagInfo("c:setVariable", //$NON-NLS-1$
            20, 5,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$j+1", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_22_4 = new TagInfo("c:if", //$NON-NLS-1$
            22, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$i=0and$j=0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_23_4 = new TagInfo("c:iterate", //$NON-NLS-1$
            23, 4,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$referenceTable/foreigns/column", //$NON-NLS-1$
                "rc", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_choose_24_4 = new TagInfo("c:choose", //$NON-NLS-1$
            24, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_when_25_4 = new TagInfo("c:when", //$NON-NLS-1$
            25, 4,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$rc/@referenceTable=$eachTable/@name", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_otherwise_27_4 = new TagInfo("c:otherwise", //$NON-NLS-1$
            27, 4,
            new String[] {
            },
            new String[] {
            } );
    private static final TagInfo _td_c_get_28_24 = new TagInfo("c:get", //$NON-NLS-1$
            28, 24,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($eachTable/@name)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_74 = new TagInfo("c:get", //$NON-NLS-1$
            28, 74,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "uppercaseFirst($rc/@referenceTable)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_137 = new TagInfo("c:get", //$NON-NLS-1$
            28, 137,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/@name", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("public Integer count");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_1_21 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_1_21); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_1_21.setRuntimeParent(null);
        _jettag_c_get_1_21.setTagInfo(_td_c_get_1_21);
        _jettag_c_get_1_21.doStart(context, out);
        _jettag_c_get_1_21.doEnd();
        out.write("s();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_3_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_3_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_3_2.setRuntimeParent(null);
        _jettag_c_iterate_3_2.setTagInfo(_td_c_iterate_3_2);
        _jettag_c_iterate_3_2.doStart(context, out);
        while (_jettag_c_iterate_3_2.okToProcessBody()) {
            RuntimeTagElement _jettag_c_iterate_4_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_4_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_4_2.setRuntimeParent(_jettag_c_iterate_3_2);
            _jettag_c_iterate_4_2.setTagInfo(_td_c_iterate_4_2);
            _jettag_c_iterate_4_2.doStart(context, out);
            while (_jettag_c_iterate_4_2.okToProcessBody()) {
                RuntimeTagElement _jettag_c_if_5_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_5_2); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_5_2.setRuntimeParent(_jettag_c_iterate_4_2);
                _jettag_c_if_5_2.setTagInfo(_td_c_if_5_2);
                _jettag_c_if_5_2.doStart(context, out);
                while (_jettag_c_if_5_2.okToProcessBody()) {
                    out.write("\tpublic Integer countRelative");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_6_30 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_30); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_6_30.setRuntimeParent(_jettag_c_if_5_2);
                    _jettag_c_get_6_30.setTagInfo(_td_c_get_6_30);
                    _jettag_c_get_6_30.doStart(context, out);
                    _jettag_c_get_6_30.doEnd();
                    RuntimeTagElement _jettag_c_get_6_88 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_88); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_6_88.setRuntimeParent(_jettag_c_if_5_2);
                    _jettag_c_get_6_88.setTagInfo(_td_c_get_6_88);
                    _jettag_c_get_6_88.doStart(context, out);
                    _jettag_c_get_6_88.doEnd();
                    out.write("s(Integer ");  //$NON-NLS-1$        
                    RuntimeTagElement _jettag_c_get_6_148 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_6_148); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_get_6_148.setRuntimeParent(_jettag_c_if_5_2);
                    _jettag_c_get_6_148.setTagInfo(_td_c_get_6_148);
                    _jettag_c_get_6_148.doStart(context, out);
                    _jettag_c_get_6_148.doEnd();
                    out.write(");");  //$NON-NLS-1$        
                    out.write(NL);         
                    _jettag_c_if_5_2.handleBodyContent(out);
                }
                _jettag_c_if_5_2.doEnd();
                _jettag_c_iterate_4_2.handleBodyContent(out);
            }
            _jettag_c_iterate_4_2.doEnd();
            _jettag_c_iterate_3_2.handleBodyContent(out);
        }
        _jettag_c_iterate_3_2.doEnd();
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        RuntimeTagElement _jettag_c_iterate_11_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_11_2); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_iterate_11_2.setRuntimeParent(null);
        _jettag_c_iterate_11_2.setTagInfo(_td_c_iterate_11_2);
        _jettag_c_iterate_11_2.doStart(context, out);
        while (_jettag_c_iterate_11_2.okToProcessBody()) {
            RuntimeTagElement _jettag_c_iterate_12_2 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_12_2); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_12_2.setRuntimeParent(_jettag_c_iterate_11_2);
            _jettag_c_iterate_12_2.setTagInfo(_td_c_iterate_12_2);
            _jettag_c_iterate_12_2.doStart(context, out);
            while (_jettag_c_iterate_12_2.okToProcessBody()) {
                RuntimeTagElement _jettag_c_if_13_3 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_13_3); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_13_3.setRuntimeParent(_jettag_c_iterate_12_2);
                _jettag_c_if_13_3.setTagInfo(_td_c_if_13_3);
                _jettag_c_if_13_3.doStart(context, out);
                while (_jettag_c_if_13_3.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_setVariable_14_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_14_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_14_4.setRuntimeParent(_jettag_c_if_13_3);
                    _jettag_c_setVariable_14_4.setTagInfo(_td_c_setVariable_14_4);
                    _jettag_c_setVariable_14_4.doStart(context, out);
                    _jettag_c_setVariable_14_4.doEnd();
                    RuntimeTagElement _jettag_c_setVariable_15_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_15_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_15_4.setRuntimeParent(_jettag_c_if_13_3);
                    _jettag_c_setVariable_15_4.setTagInfo(_td_c_setVariable_15_4);
                    _jettag_c_setVariable_15_4.doStart(context, out);
                    _jettag_c_setVariable_15_4.doEnd();
                    RuntimeTagElement _jettag_c_iterate_16_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_16_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_16_4.setRuntimeParent(_jettag_c_if_13_3);
                    _jettag_c_iterate_16_4.setTagInfo(_td_c_iterate_16_4);
                    _jettag_c_iterate_16_4.doStart(context, out);
                    while (_jettag_c_iterate_16_4.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_setVariable_17_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_17_5); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_setVariable_17_5.setRuntimeParent(_jettag_c_iterate_16_4);
                        _jettag_c_setVariable_17_5.setTagInfo(_td_c_setVariable_17_5);
                        _jettag_c_setVariable_17_5.doStart(context, out);
                        _jettag_c_setVariable_17_5.doEnd();
                        _jettag_c_iterate_16_4.handleBodyContent(out);
                    }
                    _jettag_c_iterate_16_4.doEnd();
                    RuntimeTagElement _jettag_c_iterate_19_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_19_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_iterate_19_4.setRuntimeParent(_jettag_c_if_13_3);
                    _jettag_c_iterate_19_4.setTagInfo(_td_c_iterate_19_4);
                    _jettag_c_iterate_19_4.doStart(context, out);
                    while (_jettag_c_iterate_19_4.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_setVariable_20_5 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_20_5); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_setVariable_20_5.setRuntimeParent(_jettag_c_iterate_19_4);
                        _jettag_c_setVariable_20_5.setTagInfo(_td_c_setVariable_20_5);
                        _jettag_c_setVariable_20_5.doStart(context, out);
                        _jettag_c_setVariable_20_5.doEnd();
                        _jettag_c_iterate_19_4.handleBodyContent(out);
                    }
                    _jettag_c_iterate_19_4.doEnd();
                    RuntimeTagElement _jettag_c_if_22_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_22_4); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_if_22_4.setRuntimeParent(_jettag_c_if_13_3);
                    _jettag_c_if_22_4.setTagInfo(_td_c_if_22_4);
                    _jettag_c_if_22_4.doStart(context, out);
                    while (_jettag_c_if_22_4.okToProcessBody()) {
                        RuntimeTagElement _jettag_c_iterate_23_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_23_4); //$NON-NLS-1$ //$NON-NLS-2$
                        _jettag_c_iterate_23_4.setRuntimeParent(_jettag_c_if_22_4);
                        _jettag_c_iterate_23_4.setTagInfo(_td_c_iterate_23_4);
                        _jettag_c_iterate_23_4.doStart(context, out);
                        while (_jettag_c_iterate_23_4.okToProcessBody()) {
                            RuntimeTagElement _jettag_c_choose_24_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "choose", "c:choose", _td_c_choose_24_4); //$NON-NLS-1$ //$NON-NLS-2$
                            _jettag_c_choose_24_4.setRuntimeParent(_jettag_c_iterate_23_4);
                            _jettag_c_choose_24_4.setTagInfo(_td_c_choose_24_4);
                            _jettag_c_choose_24_4.doStart(context, out);
                            JET2Writer _jettag_c_choose_24_4_saved_out = out;
                            while (_jettag_c_choose_24_4.okToProcessBody()) {
                                out = out.newNestedContentWriter();
                                RuntimeTagElement _jettag_c_when_25_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "when", "c:when", _td_c_when_25_4); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_when_25_4.setRuntimeParent(_jettag_c_choose_24_4);
                                _jettag_c_when_25_4.setTagInfo(_td_c_when_25_4);
                                _jettag_c_when_25_4.doStart(context, out);
                                JET2Writer _jettag_c_when_25_4_saved_out = out;
                                while (_jettag_c_when_25_4.okToProcessBody()) {
                                    out = out.newNestedContentWriter();
                                    _jettag_c_when_25_4.handleBodyContent(out);
                                }
                                out = _jettag_c_when_25_4_saved_out;
                                _jettag_c_when_25_4.doEnd();
                                RuntimeTagElement _jettag_c_otherwise_27_4 = context.getTagFactory().createRuntimeTag(_jetns_c, "otherwise", "c:otherwise", _td_c_otherwise_27_4); //$NON-NLS-1$ //$NON-NLS-2$
                                _jettag_c_otherwise_27_4.setRuntimeParent(_jettag_c_choose_24_4);
                                _jettag_c_otherwise_27_4.setTagInfo(_td_c_otherwise_27_4);
                                _jettag_c_otherwise_27_4.doStart(context, out);
                                JET2Writer _jettag_c_otherwise_27_4_saved_out = out;
                                while (_jettag_c_otherwise_27_4.okToProcessBody()) {
                                    out = out.newNestedContentWriter();
                                    out.write("\t\t\tpublic Integer count");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_28_24 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_24); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_28_24.setRuntimeParent(_jettag_c_otherwise_27_4);
                                    _jettag_c_get_28_24.setTagInfo(_td_c_get_28_24);
                                    _jettag_c_get_28_24.doStart(context, out);
                                    _jettag_c_get_28_24.doEnd();
                                    RuntimeTagElement _jettag_c_get_28_74 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_74); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_28_74.setRuntimeParent(_jettag_c_otherwise_27_4);
                                    _jettag_c_get_28_74.setTagInfo(_td_c_get_28_74);
                                    _jettag_c_get_28_74.doStart(context, out);
                                    _jettag_c_get_28_74.doEnd();
                                    out.write("s(Integer ");  //$NON-NLS-1$        
                                    RuntimeTagElement _jettag_c_get_28_137 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_137); //$NON-NLS-1$ //$NON-NLS-2$
                                    _jettag_c_get_28_137.setRuntimeParent(_jettag_c_otherwise_27_4);
                                    _jettag_c_get_28_137.setTagInfo(_td_c_get_28_137);
                                    _jettag_c_get_28_137.doStart(context, out);
                                    _jettag_c_get_28_137.doEnd();
                                    out.write(");");  //$NON-NLS-1$        
                                    out.write(NL);         
                                    _jettag_c_otherwise_27_4.handleBodyContent(out);
                                }
                                out = _jettag_c_otherwise_27_4_saved_out;
                                _jettag_c_otherwise_27_4.doEnd();
                                _jettag_c_choose_24_4.handleBodyContent(out);
                            }
                            out = _jettag_c_choose_24_4_saved_out;
                            _jettag_c_choose_24_4.doEnd();
                            _jettag_c_iterate_23_4.handleBodyContent(out);
                        }
                        _jettag_c_iterate_23_4.doEnd();
                        _jettag_c_if_22_4.handleBodyContent(out);
                    }
                    _jettag_c_if_22_4.doEnd();
                    _jettag_c_if_13_3.handleBodyContent(out);
                }
                _jettag_c_if_13_3.doEnd();
                _jettag_c_iterate_12_2.handleBodyContent(out);
            }
            _jettag_c_iterate_12_2.doEnd();
            out.write("\t");  //$NON-NLS-1$        
            _jettag_c_iterate_11_2.handleBodyContent(out);
        }
        _jettag_c_iterate_11_2.doEnd();
        out.write("\t");  //$NON-NLS-1$        
    }
}
