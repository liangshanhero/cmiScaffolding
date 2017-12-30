package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_image implements JET2Template {
    private static final String _jetns_ws = "org.eclipse.jet.workspaceTags"; //$NON-NLS-1$

    public _jet_image() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_ws_copyFile_3_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            3, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/images/bb.gif", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/images/bb.gif", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_4_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            4, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/images/blc.gif", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/images/blc.gif", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_5_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            5, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/images/brc.gif", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/images/brc.gif", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_6_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            6, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/images/button_hover.gif", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/images/button_hover.gif", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_7_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            7, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/images/button_span_hover.gif", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/images/button_span_hover.gif", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_8_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            8, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/images/button_span.gif", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/images/button_span.gif", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_9_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            9, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/images/button.gif", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/images/button.gif", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_10_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            10, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/images/buttonhover.gif", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/images/buttonhover.gif", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_11_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            11, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/images/l.gif", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/images/l.gif", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_12_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            12, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/images/me4s_logo.jpg", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/images/me4s_logo.jpg", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_13_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            13, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/images/r.gif", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/images/r.gif", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_14_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            14, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/images/save_button_span_hover.gif", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/images/save_button_span_hover.gif", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_15_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            15, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/images/save_button_span.gif", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/images/save_button_span.gif", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_16_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            16, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/images/tb.gif", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/images/tb.gif", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_17_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            17, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/images/thbg.gif", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/images/thbg.gif", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_18_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            18, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/images/tlc.gif", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/images/tlc.gif", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_19_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            19, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/images/trc.gif", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/images/trc.gif", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_20_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            20, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/images/icons/back.gif", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/images/icons/back.gif", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_21_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            21, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/images/icons/delete.gif", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/images/icons/delete.gif", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_22_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            22, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/images/icons/edit.gif", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/images/icons/edit.gif", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_23_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            23, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/images/icons/new.gif", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/images/icons/new.gif", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_24_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            24, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/images/icons/view.gif", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/images/icons/view.gif", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_3_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_3_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_3_1.setRuntimeParent(null);
        _jettag_ws_copyFile_3_1.setTagInfo(_td_ws_copyFile_3_1);
        _jettag_ws_copyFile_3_1.doStart(context, out);
        _jettag_ws_copyFile_3_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_4_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_4_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_4_1.setRuntimeParent(null);
        _jettag_ws_copyFile_4_1.setTagInfo(_td_ws_copyFile_4_1);
        _jettag_ws_copyFile_4_1.doStart(context, out);
        _jettag_ws_copyFile_4_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_5_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_5_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_5_1.setRuntimeParent(null);
        _jettag_ws_copyFile_5_1.setTagInfo(_td_ws_copyFile_5_1);
        _jettag_ws_copyFile_5_1.doStart(context, out);
        _jettag_ws_copyFile_5_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_6_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_6_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_6_1.setRuntimeParent(null);
        _jettag_ws_copyFile_6_1.setTagInfo(_td_ws_copyFile_6_1);
        _jettag_ws_copyFile_6_1.doStart(context, out);
        _jettag_ws_copyFile_6_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_7_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_7_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_7_1.setRuntimeParent(null);
        _jettag_ws_copyFile_7_1.setTagInfo(_td_ws_copyFile_7_1);
        _jettag_ws_copyFile_7_1.doStart(context, out);
        _jettag_ws_copyFile_7_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_8_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_8_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_8_1.setRuntimeParent(null);
        _jettag_ws_copyFile_8_1.setTagInfo(_td_ws_copyFile_8_1);
        _jettag_ws_copyFile_8_1.doStart(context, out);
        _jettag_ws_copyFile_8_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_9_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_9_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_9_1.setRuntimeParent(null);
        _jettag_ws_copyFile_9_1.setTagInfo(_td_ws_copyFile_9_1);
        _jettag_ws_copyFile_9_1.doStart(context, out);
        _jettag_ws_copyFile_9_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_10_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_10_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_10_1.setRuntimeParent(null);
        _jettag_ws_copyFile_10_1.setTagInfo(_td_ws_copyFile_10_1);
        _jettag_ws_copyFile_10_1.doStart(context, out);
        _jettag_ws_copyFile_10_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_11_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_11_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_11_1.setRuntimeParent(null);
        _jettag_ws_copyFile_11_1.setTagInfo(_td_ws_copyFile_11_1);
        _jettag_ws_copyFile_11_1.doStart(context, out);
        _jettag_ws_copyFile_11_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_12_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_12_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_12_1.setRuntimeParent(null);
        _jettag_ws_copyFile_12_1.setTagInfo(_td_ws_copyFile_12_1);
        _jettag_ws_copyFile_12_1.doStart(context, out);
        _jettag_ws_copyFile_12_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_13_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_13_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_13_1.setRuntimeParent(null);
        _jettag_ws_copyFile_13_1.setTagInfo(_td_ws_copyFile_13_1);
        _jettag_ws_copyFile_13_1.doStart(context, out);
        _jettag_ws_copyFile_13_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_14_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_14_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_14_1.setRuntimeParent(null);
        _jettag_ws_copyFile_14_1.setTagInfo(_td_ws_copyFile_14_1);
        _jettag_ws_copyFile_14_1.doStart(context, out);
        _jettag_ws_copyFile_14_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_15_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_15_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_15_1.setRuntimeParent(null);
        _jettag_ws_copyFile_15_1.setTagInfo(_td_ws_copyFile_15_1);
        _jettag_ws_copyFile_15_1.doStart(context, out);
        _jettag_ws_copyFile_15_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_16_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_16_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_16_1.setRuntimeParent(null);
        _jettag_ws_copyFile_16_1.setTagInfo(_td_ws_copyFile_16_1);
        _jettag_ws_copyFile_16_1.doStart(context, out);
        _jettag_ws_copyFile_16_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_17_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_17_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_17_1.setRuntimeParent(null);
        _jettag_ws_copyFile_17_1.setTagInfo(_td_ws_copyFile_17_1);
        _jettag_ws_copyFile_17_1.doStart(context, out);
        _jettag_ws_copyFile_17_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_18_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_18_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_18_1.setRuntimeParent(null);
        _jettag_ws_copyFile_18_1.setTagInfo(_td_ws_copyFile_18_1);
        _jettag_ws_copyFile_18_1.doStart(context, out);
        _jettag_ws_copyFile_18_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_19_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_19_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_19_1.setRuntimeParent(null);
        _jettag_ws_copyFile_19_1.setTagInfo(_td_ws_copyFile_19_1);
        _jettag_ws_copyFile_19_1.doStart(context, out);
        _jettag_ws_copyFile_19_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_20_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_20_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_20_1.setRuntimeParent(null);
        _jettag_ws_copyFile_20_1.setTagInfo(_td_ws_copyFile_20_1);
        _jettag_ws_copyFile_20_1.doStart(context, out);
        _jettag_ws_copyFile_20_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_21_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_21_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_21_1.setRuntimeParent(null);
        _jettag_ws_copyFile_21_1.setTagInfo(_td_ws_copyFile_21_1);
        _jettag_ws_copyFile_21_1.doStart(context, out);
        _jettag_ws_copyFile_21_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_22_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_22_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_22_1.setRuntimeParent(null);
        _jettag_ws_copyFile_22_1.setTagInfo(_td_ws_copyFile_22_1);
        _jettag_ws_copyFile_22_1.doStart(context, out);
        _jettag_ws_copyFile_22_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_23_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_23_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_23_1.setRuntimeParent(null);
        _jettag_ws_copyFile_23_1.setTagInfo(_td_ws_copyFile_23_1);
        _jettag_ws_copyFile_23_1.doStart(context, out);
        _jettag_ws_copyFile_23_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_24_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_24_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_24_1.setRuntimeParent(null);
        _jettag_ws_copyFile_24_1.setTagInfo(_td_ws_copyFile_24_1);
        _jettag_ws_copyFile_24_1.doStart(context, out);
        _jettag_ws_copyFile_24_1.doEnd();
    }
}
