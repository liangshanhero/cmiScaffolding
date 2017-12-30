package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_jar implements JET2Template {
    private static final String _jetns_ws = "org.eclipse.jet.workspaceTags"; //$NON-NLS-1$

    public _jet_jar() {
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
                "templates/content/lib/antlr-2.7.6.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/antlr-2.7.6.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_4_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            4, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/aopalliance-1.0.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/aopalliance-1.0.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_5_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            5, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/aspectjweaver-1.6.9.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/aspectjweaver-1.6.9.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_6_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            6, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/c3p0-0.9.1.2.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/c3p0-0.9.1.2.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_7_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            7, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/cas-client-core-3.1.12.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/cas-client-core-3.1.12.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_8_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            8, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/cglib-nodep-2.2.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/cglib-nodep-2.2.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_9_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            9, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/commons-beanutils-1.7.0.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/commons-beanutils-1.7.0.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_10_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            10, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/commons-beanutils-1.8.0.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/commons-beanutils-1.8.0.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_11_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            11, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/commons-beanutils-1.8.3.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/commons-beanutils-1.8.3.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_12_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            12, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/commons-codec-1.5.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/commons-codec-1.5.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_13_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            13, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/commons-collections-3.1.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/commons-collections-3.1.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_14_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            14, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/commons-collections-3.2.1.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/commons-collections-3.2.1.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_15_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            15, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/commons-collections-3.2.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/commons-collections-3.2.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_16_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            16, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/commons-dbcp-1.3.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/commons-dbcp-1.3.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_17_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            17, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/commons-dbcp-1.4.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/commons-dbcp-1.4.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_18_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            18, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/commons-fileupload-1.2.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/commons-fileupload-1.2.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_19_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            19, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/commons-httpclient-3.1.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/commons-httpclient-3.1.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_20_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            20, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/commons-io-1.4.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/commons-io-1.4.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_21_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            21, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/commons-lang-2.5.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/commons-lang-2.5.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_22_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            22, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/commons-logging-1.1.1.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/commons-logging-1.1.1.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_23_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            23, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/commons-pool-1.5.3.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/commons-pool-1.5.3.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_24_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            24, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/commons-pool-1.5.4.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/commons-pool-1.5.4.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_25_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            25, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/cxf-2.1.9.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/cxf-2.1.9.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_26_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            26, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/derbyclient.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/derbyclient.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_27_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            27, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/dom4j-1.6.1.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/dom4j-1.6.1.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_28_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            28, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/dwr-2.0.5.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/dwr-2.0.5.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_29_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            29, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/cn.edu.scau.cmi.scaffolding.util.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/cn.edu.scau.cmi.scaffolding.util.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_30_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            30, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/ehcache-1.6.2.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/ehcache-1.6.2.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_31_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            31, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/ezmorph-1.0.6.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/ezmorph-1.0.6.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_32_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            32, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/FastInfoset-1.2.7.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/FastInfoset-1.2.7.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_33_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            33, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/geronimo-activation_1.1_spec-1.0.2.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/geronimo-activation_1.1_spec-1.0.2.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_34_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            34, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/geronimo-stax-api_1.0_spec-1.0.1.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/geronimo-stax-api_1.0_spec-1.0.1.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_35_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            35, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/geronimo-ws-metadata_2.0_spec-1.1.2.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/geronimo-ws-metadata_2.0_spec-1.1.2.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_36_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            36, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/guice-3.0-rc3.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/guice-3.0-rc3.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_37_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            37, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/guice-assistedinject-3.0-rc3.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/guice-assistedinject-3.0-rc3.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_38_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            38, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/guice-multibindings-3.0-rc3.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/guice-multibindings-3.0-rc3.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_39_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            39, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/guice-persist-3.0-rc3.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/guice-persist-3.0-rc3.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_40_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            40, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/guice-servlet-3.0-rc3.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/guice-servlet-3.0-rc3.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_41_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            41, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/hibernate-annotations-3.5.5.Final.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/hibernate-annotations-3.5.5.Final.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_42_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            42, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/hibernate-commons-annotations-3.2.0.Final.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/hibernate-commons-annotations-3.2.0.Final.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_43_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            43, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/hibernate-core-3.5.5.Final.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/hibernate-core-3.5.5.Final.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_44_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            44, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/hibernate-entitymanager-3.5.5.Final.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/hibernate-entitymanager-3.5.5.Final.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_45_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            45, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/hibernate-jpa-2.0-api-1.0.0.Final.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/hibernate-jpa-2.0-api-1.0.0.Final.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_46_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            46, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/hibernate-validator-4.1.0.Final.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/hibernate-validator-4.1.0.Final.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_47_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            47, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/httpclient-4.1.1.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/httpclient-4.1.1.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_48_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            48, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/jackson-core-asl-1.6.3.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/jackson-core-asl-1.6.3.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_49_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            49, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/jackson-jaxrs-1.6.3.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/jackson-jaxrs-1.6.3.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_50_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            50, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/jackson-mapper-asl-1.6.3.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/jackson-mapper-asl-1.6.3.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_51_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            51, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/javassist.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/javassist.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_52_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            52, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/javax.inject-1.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/javax.inject-1.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_53_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            53, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/javax.servlet.jsp.jstl.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/javax.servlet.jsp.jstl.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_54_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            54, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/jaxb-api-2.1.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/jaxb-api-2.1.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_55_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            55, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/jaxb-impl-2.1.9.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/jaxb-impl-2.1.9.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_56_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            56, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/jaxb-xjc-2.1.9.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/jaxb-xjc-2.1.9.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_57_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            57, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/jaxen-1.1.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/jaxen-1.1.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_58_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            58, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/jcl-over-slf4j-1.6.6.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/jcl-over-slf4j-1.6.6.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_59_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            59, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/jdom-1.0.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/jdom-1.0.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_60_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            60, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/jettison-1.1.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/jettison-1.1.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_61_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            61, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/jra-1.0-alpha-4.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/jra-1.0-alpha-4.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_62_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            62, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/json-lib-2.4-jdk15.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/json-lib-2.4-jdk15.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_63_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            63, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/jstl-impl-1.2.2.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/jstl-impl-1.2.2.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_64_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            64, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/jta-1.1.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/jta-1.1.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_65_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            65, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/junit-4.7.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/junit-4.7.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_66_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            66, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/log4j-1.2.16.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/log4j-1.2.16.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_67_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            67, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/log4j-1.2.17.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/log4j-1.2.17.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_68_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            68, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/mysql-connector-java-5.1.35-bin.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/mysql-connector-java-5.1.35-bin.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_69_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            69, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/neethi-2.0.4.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/neethi-2.0.4.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_70_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            70, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/ognl-2.6.9.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/ognl-2.6.9.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_71_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            71, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/openid4java-nodeps-0.9.6.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/openid4java-nodeps-0.9.6.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_72_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            72, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/org.springframework.aop-3.1.1.RELEASE.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/org.springframework.aop-3.1.1.RELEASE.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_73_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            73, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/org.springframework.asm-3.1.1.RELEASE.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/org.springframework.asm-3.1.1.RELEASE.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_74_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            74, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/org.springframework.aspects-3.1.1.RELEASE.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/org.springframework.aspects-3.1.1.RELEASE.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_75_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            75, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/org.springframework.beans-3.1.1.RELEASE.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/org.springframework.beans-3.1.1.RELEASE.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_76_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            76, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/org.springframework.binding-2.3.1.RELEASE.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/org.springframework.binding-2.3.1.RELEASE.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_77_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            77, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/org.springframework.context-3.1.1.RELEASE.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/org.springframework.context-3.1.1.RELEASE.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_78_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            78, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/org.springframework.context.support-3.1.1.RELEASE.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/org.springframework.context.support-3.1.1.RELEASE.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_79_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            79, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/org.springframework.core-3.1.1.RELEASE.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/org.springframework.core-3.1.1.RELEASE.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_80_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            80, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/org.springframework.expression-3.1.1.RELEASE.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/org.springframework.expression-3.1.1.RELEASE.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_81_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            81, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/org.springframework.instrument-3.1.1.RELEASE.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/org.springframework.instrument-3.1.1.RELEASE.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_82_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            82, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/org.springframework.instrument.tomcat-3.1.1.RELEASE.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/org.springframework.instrument.tomcat-3.1.1.RELEASE.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_83_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            83, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/org.springframework.jdbc-3.1.1.RELEASE.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/org.springframework.jdbc-3.1.1.RELEASE.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_84_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            84, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/org.springframework.jms-3.1.1.RELEASE.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/org.springframework.jms-3.1.1.RELEASE.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_85_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            85, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/org.springframework.js-2.3.1.RELEASE.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/org.springframework.js-2.3.1.RELEASE.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_86_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            86, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/org.springframework.js.resources-2.3.1.RELEASE.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/org.springframework.js.resources-2.3.1.RELEASE.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_87_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            87, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/org.springframework.orm-3.1.1.RELEASE.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/org.springframework.orm-3.1.1.RELEASE.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_88_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            88, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/org.springframework.oxm-3.1.1.RELEASE.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/org.springframework.oxm-3.1.1.RELEASE.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_89_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            89, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/org.springframework.test-3.1.1.RELEASE.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/org.springframework.test-3.1.1.RELEASE.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_90_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            90, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/org.springframework.transaction-3.1.1.RELEASE.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/org.springframework.transaction-3.1.1.RELEASE.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_91_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            91, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/org.springframework.web-3.1.1.RELEASE.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/org.springframework.web-3.1.1.RELEASE.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_92_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            92, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/org.springframework.web.portlet-3.1.1.RELEASE.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/org.springframework.web.portlet-3.1.1.RELEASE.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_93_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            93, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/org.springframework.web.servlet-3.1.1.RELEASE.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/org.springframework.web.servlet-3.1.1.RELEASE.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_94_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            94, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/org.springframework.web.struts-3.1.1.RELEASE.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/org.springframework.web.struts-3.1.1.RELEASE.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_95_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            95, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/org.springframework.webflow-2.3.1.RELEASE.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/org.springframework.webflow-2.3.1.RELEASE.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_96_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            96, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/postgresql-8.3-603.jdbc3.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/postgresql-8.3-603.jdbc3.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_97_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            97, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/saaj-api-1.3.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/saaj-api-1.3.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_98_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            98, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/saaj-impl-1.3.2.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/saaj-impl-1.3.2.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_99_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            99, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/serializer-2.7.1.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/serializer-2.7.1.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_100_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            100, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/sitemesh-2.4.2.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/sitemesh-2.4.2.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_101_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            101, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/slf4j-api-1.6.6.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/slf4j-api-1.6.6.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_102_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            102, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/slf4j-log4j12-1.6.6.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/slf4j-log4j12-1.6.6.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_103_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            103, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/spring-security-acl-3.1.0.RELEASE.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/spring-security-acl-3.1.0.RELEASE.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_104_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            104, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/spring-security-aspects-3.1.0.RELEASE.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/spring-security-aspects-3.1.0.RELEASE.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_105_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            105, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/spring-security-cas-3.1.0.RELEASE.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/spring-security-cas-3.1.0.RELEASE.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_106_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            106, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/spring-security-config-3.1.0.RELEASE.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/spring-security-config-3.1.0.RELEASE.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_107_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            107, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/spring-security-core-3.1.0.RELEASE.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/spring-security-core-3.1.0.RELEASE.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_108_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            108, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/spring-security-crypto-3.1.0.RELEASE.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/spring-security-crypto-3.1.0.RELEASE.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_109_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            109, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/spring-security-ldap-3.1.0.RELEASE.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/spring-security-ldap-3.1.0.RELEASE.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_110_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            110, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/spring-security-openid-3.1.0.RELEASE.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/spring-security-openid-3.1.0.RELEASE.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_111_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            111, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/spring-security-remoting-3.1.0.RELEASE.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/spring-security-remoting-3.1.0.RELEASE.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_112_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            112, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/spring-security-taglibs-3.1.0.RELEASE.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/spring-security-taglibs-3.1.0.RELEASE.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_113_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            113, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/spring-security-web-3.1.0.RELEASE.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/spring-security-web-3.1.0.RELEASE.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_114_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            114, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/standard-1.1.2.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/standard-1.1.2.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_115_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            115, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/testng-5.10-jdk15.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/testng-5.10-jdk15.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_116_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            116, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/transactions-essentials-all.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/transactions-essentials-all.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_117_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            117, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/velocity-1.6.2.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/velocity-1.6.2.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_118_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            118, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/wsdl4j-1.6.2.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/wsdl4j-1.6.2.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_119_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            119, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/wss4j-1.5.8.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/wss4j-1.5.8.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_120_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            120, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/wstx-asl-3.2.9.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/wstx-asl-3.2.9.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_121_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            121, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/xalan-2.7.1.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/xalan-2.7.1.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_122_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            122, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/xercesImpl-2.9.0.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/xercesImpl-2.9.0.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_123_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            123, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/xml-apis-2.9.0.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/xml-apis-2.9.0.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_124_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            124, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/xml-resolver-1.2.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/xml-resolver-1.2.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_125_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            125, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/xmlbeans-2.4.0.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/xmlbeans-2.4.0.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_126_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            126, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/XmlSchema-1.4.5.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/XmlSchema-1.4.5.jar", //$NON-NLS-1$
            } );
    private static final TagInfo _td_ws_copyFile_127_1 = new TagInfo("ws:copyFile", //$NON-NLS-1$
            127, 1,
            new String[] {
                "src", //$NON-NLS-1$
                "binary", //$NON-NLS-1$
                "target", //$NON-NLS-1$
            },
            new String[] {
                "templates/content/lib/xmlsec-1.4.3.jar", //$NON-NLS-1$
                "true", //$NON-NLS-1$
                "{$projectName}/WebRoot/WEB-INF/lib/xmlsec-1.4.3.jar", //$NON-NLS-1$
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
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_25_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_25_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_25_1.setRuntimeParent(null);
        _jettag_ws_copyFile_25_1.setTagInfo(_td_ws_copyFile_25_1);
        _jettag_ws_copyFile_25_1.doStart(context, out);
        _jettag_ws_copyFile_25_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_26_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_26_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_26_1.setRuntimeParent(null);
        _jettag_ws_copyFile_26_1.setTagInfo(_td_ws_copyFile_26_1);
        _jettag_ws_copyFile_26_1.doStart(context, out);
        _jettag_ws_copyFile_26_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_27_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_27_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_27_1.setRuntimeParent(null);
        _jettag_ws_copyFile_27_1.setTagInfo(_td_ws_copyFile_27_1);
        _jettag_ws_copyFile_27_1.doStart(context, out);
        _jettag_ws_copyFile_27_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_28_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_28_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_28_1.setRuntimeParent(null);
        _jettag_ws_copyFile_28_1.setTagInfo(_td_ws_copyFile_28_1);
        _jettag_ws_copyFile_28_1.doStart(context, out);
        _jettag_ws_copyFile_28_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_29_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_29_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_29_1.setRuntimeParent(null);
        _jettag_ws_copyFile_29_1.setTagInfo(_td_ws_copyFile_29_1);
        _jettag_ws_copyFile_29_1.doStart(context, out);
        _jettag_ws_copyFile_29_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_30_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_30_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_30_1.setRuntimeParent(null);
        _jettag_ws_copyFile_30_1.setTagInfo(_td_ws_copyFile_30_1);
        _jettag_ws_copyFile_30_1.doStart(context, out);
        _jettag_ws_copyFile_30_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_31_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_31_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_31_1.setRuntimeParent(null);
        _jettag_ws_copyFile_31_1.setTagInfo(_td_ws_copyFile_31_1);
        _jettag_ws_copyFile_31_1.doStart(context, out);
        _jettag_ws_copyFile_31_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_32_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_32_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_32_1.setRuntimeParent(null);
        _jettag_ws_copyFile_32_1.setTagInfo(_td_ws_copyFile_32_1);
        _jettag_ws_copyFile_32_1.doStart(context, out);
        _jettag_ws_copyFile_32_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_33_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_33_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_33_1.setRuntimeParent(null);
        _jettag_ws_copyFile_33_1.setTagInfo(_td_ws_copyFile_33_1);
        _jettag_ws_copyFile_33_1.doStart(context, out);
        _jettag_ws_copyFile_33_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_34_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_34_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_34_1.setRuntimeParent(null);
        _jettag_ws_copyFile_34_1.setTagInfo(_td_ws_copyFile_34_1);
        _jettag_ws_copyFile_34_1.doStart(context, out);
        _jettag_ws_copyFile_34_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_35_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_35_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_35_1.setRuntimeParent(null);
        _jettag_ws_copyFile_35_1.setTagInfo(_td_ws_copyFile_35_1);
        _jettag_ws_copyFile_35_1.doStart(context, out);
        _jettag_ws_copyFile_35_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_36_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_36_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_36_1.setRuntimeParent(null);
        _jettag_ws_copyFile_36_1.setTagInfo(_td_ws_copyFile_36_1);
        _jettag_ws_copyFile_36_1.doStart(context, out);
        _jettag_ws_copyFile_36_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_37_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_37_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_37_1.setRuntimeParent(null);
        _jettag_ws_copyFile_37_1.setTagInfo(_td_ws_copyFile_37_1);
        _jettag_ws_copyFile_37_1.doStart(context, out);
        _jettag_ws_copyFile_37_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_38_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_38_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_38_1.setRuntimeParent(null);
        _jettag_ws_copyFile_38_1.setTagInfo(_td_ws_copyFile_38_1);
        _jettag_ws_copyFile_38_1.doStart(context, out);
        _jettag_ws_copyFile_38_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_39_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_39_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_39_1.setRuntimeParent(null);
        _jettag_ws_copyFile_39_1.setTagInfo(_td_ws_copyFile_39_1);
        _jettag_ws_copyFile_39_1.doStart(context, out);
        _jettag_ws_copyFile_39_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_40_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_40_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_40_1.setRuntimeParent(null);
        _jettag_ws_copyFile_40_1.setTagInfo(_td_ws_copyFile_40_1);
        _jettag_ws_copyFile_40_1.doStart(context, out);
        _jettag_ws_copyFile_40_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_41_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_41_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_41_1.setRuntimeParent(null);
        _jettag_ws_copyFile_41_1.setTagInfo(_td_ws_copyFile_41_1);
        _jettag_ws_copyFile_41_1.doStart(context, out);
        _jettag_ws_copyFile_41_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_42_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_42_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_42_1.setRuntimeParent(null);
        _jettag_ws_copyFile_42_1.setTagInfo(_td_ws_copyFile_42_1);
        _jettag_ws_copyFile_42_1.doStart(context, out);
        _jettag_ws_copyFile_42_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_43_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_43_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_43_1.setRuntimeParent(null);
        _jettag_ws_copyFile_43_1.setTagInfo(_td_ws_copyFile_43_1);
        _jettag_ws_copyFile_43_1.doStart(context, out);
        _jettag_ws_copyFile_43_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_44_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_44_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_44_1.setRuntimeParent(null);
        _jettag_ws_copyFile_44_1.setTagInfo(_td_ws_copyFile_44_1);
        _jettag_ws_copyFile_44_1.doStart(context, out);
        _jettag_ws_copyFile_44_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_45_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_45_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_45_1.setRuntimeParent(null);
        _jettag_ws_copyFile_45_1.setTagInfo(_td_ws_copyFile_45_1);
        _jettag_ws_copyFile_45_1.doStart(context, out);
        _jettag_ws_copyFile_45_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_46_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_46_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_46_1.setRuntimeParent(null);
        _jettag_ws_copyFile_46_1.setTagInfo(_td_ws_copyFile_46_1);
        _jettag_ws_copyFile_46_1.doStart(context, out);
        _jettag_ws_copyFile_46_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_47_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_47_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_47_1.setRuntimeParent(null);
        _jettag_ws_copyFile_47_1.setTagInfo(_td_ws_copyFile_47_1);
        _jettag_ws_copyFile_47_1.doStart(context, out);
        _jettag_ws_copyFile_47_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_48_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_48_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_48_1.setRuntimeParent(null);
        _jettag_ws_copyFile_48_1.setTagInfo(_td_ws_copyFile_48_1);
        _jettag_ws_copyFile_48_1.doStart(context, out);
        _jettag_ws_copyFile_48_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_49_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_49_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_49_1.setRuntimeParent(null);
        _jettag_ws_copyFile_49_1.setTagInfo(_td_ws_copyFile_49_1);
        _jettag_ws_copyFile_49_1.doStart(context, out);
        _jettag_ws_copyFile_49_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_50_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_50_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_50_1.setRuntimeParent(null);
        _jettag_ws_copyFile_50_1.setTagInfo(_td_ws_copyFile_50_1);
        _jettag_ws_copyFile_50_1.doStart(context, out);
        _jettag_ws_copyFile_50_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_51_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_51_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_51_1.setRuntimeParent(null);
        _jettag_ws_copyFile_51_1.setTagInfo(_td_ws_copyFile_51_1);
        _jettag_ws_copyFile_51_1.doStart(context, out);
        _jettag_ws_copyFile_51_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_52_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_52_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_52_1.setRuntimeParent(null);
        _jettag_ws_copyFile_52_1.setTagInfo(_td_ws_copyFile_52_1);
        _jettag_ws_copyFile_52_1.doStart(context, out);
        _jettag_ws_copyFile_52_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_53_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_53_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_53_1.setRuntimeParent(null);
        _jettag_ws_copyFile_53_1.setTagInfo(_td_ws_copyFile_53_1);
        _jettag_ws_copyFile_53_1.doStart(context, out);
        _jettag_ws_copyFile_53_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_54_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_54_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_54_1.setRuntimeParent(null);
        _jettag_ws_copyFile_54_1.setTagInfo(_td_ws_copyFile_54_1);
        _jettag_ws_copyFile_54_1.doStart(context, out);
        _jettag_ws_copyFile_54_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_55_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_55_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_55_1.setRuntimeParent(null);
        _jettag_ws_copyFile_55_1.setTagInfo(_td_ws_copyFile_55_1);
        _jettag_ws_copyFile_55_1.doStart(context, out);
        _jettag_ws_copyFile_55_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_56_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_56_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_56_1.setRuntimeParent(null);
        _jettag_ws_copyFile_56_1.setTagInfo(_td_ws_copyFile_56_1);
        _jettag_ws_copyFile_56_1.doStart(context, out);
        _jettag_ws_copyFile_56_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_57_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_57_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_57_1.setRuntimeParent(null);
        _jettag_ws_copyFile_57_1.setTagInfo(_td_ws_copyFile_57_1);
        _jettag_ws_copyFile_57_1.doStart(context, out);
        _jettag_ws_copyFile_57_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_58_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_58_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_58_1.setRuntimeParent(null);
        _jettag_ws_copyFile_58_1.setTagInfo(_td_ws_copyFile_58_1);
        _jettag_ws_copyFile_58_1.doStart(context, out);
        _jettag_ws_copyFile_58_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_59_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_59_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_59_1.setRuntimeParent(null);
        _jettag_ws_copyFile_59_1.setTagInfo(_td_ws_copyFile_59_1);
        _jettag_ws_copyFile_59_1.doStart(context, out);
        _jettag_ws_copyFile_59_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_60_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_60_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_60_1.setRuntimeParent(null);
        _jettag_ws_copyFile_60_1.setTagInfo(_td_ws_copyFile_60_1);
        _jettag_ws_copyFile_60_1.doStart(context, out);
        _jettag_ws_copyFile_60_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_61_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_61_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_61_1.setRuntimeParent(null);
        _jettag_ws_copyFile_61_1.setTagInfo(_td_ws_copyFile_61_1);
        _jettag_ws_copyFile_61_1.doStart(context, out);
        _jettag_ws_copyFile_61_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_62_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_62_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_62_1.setRuntimeParent(null);
        _jettag_ws_copyFile_62_1.setTagInfo(_td_ws_copyFile_62_1);
        _jettag_ws_copyFile_62_1.doStart(context, out);
        _jettag_ws_copyFile_62_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_63_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_63_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_63_1.setRuntimeParent(null);
        _jettag_ws_copyFile_63_1.setTagInfo(_td_ws_copyFile_63_1);
        _jettag_ws_copyFile_63_1.doStart(context, out);
        _jettag_ws_copyFile_63_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_64_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_64_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_64_1.setRuntimeParent(null);
        _jettag_ws_copyFile_64_1.setTagInfo(_td_ws_copyFile_64_1);
        _jettag_ws_copyFile_64_1.doStart(context, out);
        _jettag_ws_copyFile_64_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_65_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_65_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_65_1.setRuntimeParent(null);
        _jettag_ws_copyFile_65_1.setTagInfo(_td_ws_copyFile_65_1);
        _jettag_ws_copyFile_65_1.doStart(context, out);
        _jettag_ws_copyFile_65_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_66_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_66_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_66_1.setRuntimeParent(null);
        _jettag_ws_copyFile_66_1.setTagInfo(_td_ws_copyFile_66_1);
        _jettag_ws_copyFile_66_1.doStart(context, out);
        _jettag_ws_copyFile_66_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_67_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_67_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_67_1.setRuntimeParent(null);
        _jettag_ws_copyFile_67_1.setTagInfo(_td_ws_copyFile_67_1);
        _jettag_ws_copyFile_67_1.doStart(context, out);
        _jettag_ws_copyFile_67_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_68_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_68_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_68_1.setRuntimeParent(null);
        _jettag_ws_copyFile_68_1.setTagInfo(_td_ws_copyFile_68_1);
        _jettag_ws_copyFile_68_1.doStart(context, out);
        _jettag_ws_copyFile_68_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_69_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_69_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_69_1.setRuntimeParent(null);
        _jettag_ws_copyFile_69_1.setTagInfo(_td_ws_copyFile_69_1);
        _jettag_ws_copyFile_69_1.doStart(context, out);
        _jettag_ws_copyFile_69_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_70_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_70_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_70_1.setRuntimeParent(null);
        _jettag_ws_copyFile_70_1.setTagInfo(_td_ws_copyFile_70_1);
        _jettag_ws_copyFile_70_1.doStart(context, out);
        _jettag_ws_copyFile_70_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_71_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_71_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_71_1.setRuntimeParent(null);
        _jettag_ws_copyFile_71_1.setTagInfo(_td_ws_copyFile_71_1);
        _jettag_ws_copyFile_71_1.doStart(context, out);
        _jettag_ws_copyFile_71_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_72_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_72_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_72_1.setRuntimeParent(null);
        _jettag_ws_copyFile_72_1.setTagInfo(_td_ws_copyFile_72_1);
        _jettag_ws_copyFile_72_1.doStart(context, out);
        _jettag_ws_copyFile_72_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_73_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_73_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_73_1.setRuntimeParent(null);
        _jettag_ws_copyFile_73_1.setTagInfo(_td_ws_copyFile_73_1);
        _jettag_ws_copyFile_73_1.doStart(context, out);
        _jettag_ws_copyFile_73_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_74_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_74_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_74_1.setRuntimeParent(null);
        _jettag_ws_copyFile_74_1.setTagInfo(_td_ws_copyFile_74_1);
        _jettag_ws_copyFile_74_1.doStart(context, out);
        _jettag_ws_copyFile_74_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_75_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_75_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_75_1.setRuntimeParent(null);
        _jettag_ws_copyFile_75_1.setTagInfo(_td_ws_copyFile_75_1);
        _jettag_ws_copyFile_75_1.doStart(context, out);
        _jettag_ws_copyFile_75_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_76_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_76_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_76_1.setRuntimeParent(null);
        _jettag_ws_copyFile_76_1.setTagInfo(_td_ws_copyFile_76_1);
        _jettag_ws_copyFile_76_1.doStart(context, out);
        _jettag_ws_copyFile_76_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_77_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_77_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_77_1.setRuntimeParent(null);
        _jettag_ws_copyFile_77_1.setTagInfo(_td_ws_copyFile_77_1);
        _jettag_ws_copyFile_77_1.doStart(context, out);
        _jettag_ws_copyFile_77_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_78_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_78_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_78_1.setRuntimeParent(null);
        _jettag_ws_copyFile_78_1.setTagInfo(_td_ws_copyFile_78_1);
        _jettag_ws_copyFile_78_1.doStart(context, out);
        _jettag_ws_copyFile_78_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_79_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_79_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_79_1.setRuntimeParent(null);
        _jettag_ws_copyFile_79_1.setTagInfo(_td_ws_copyFile_79_1);
        _jettag_ws_copyFile_79_1.doStart(context, out);
        _jettag_ws_copyFile_79_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_80_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_80_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_80_1.setRuntimeParent(null);
        _jettag_ws_copyFile_80_1.setTagInfo(_td_ws_copyFile_80_1);
        _jettag_ws_copyFile_80_1.doStart(context, out);
        _jettag_ws_copyFile_80_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_81_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_81_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_81_1.setRuntimeParent(null);
        _jettag_ws_copyFile_81_1.setTagInfo(_td_ws_copyFile_81_1);
        _jettag_ws_copyFile_81_1.doStart(context, out);
        _jettag_ws_copyFile_81_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_82_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_82_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_82_1.setRuntimeParent(null);
        _jettag_ws_copyFile_82_1.setTagInfo(_td_ws_copyFile_82_1);
        _jettag_ws_copyFile_82_1.doStart(context, out);
        _jettag_ws_copyFile_82_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_83_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_83_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_83_1.setRuntimeParent(null);
        _jettag_ws_copyFile_83_1.setTagInfo(_td_ws_copyFile_83_1);
        _jettag_ws_copyFile_83_1.doStart(context, out);
        _jettag_ws_copyFile_83_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_84_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_84_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_84_1.setRuntimeParent(null);
        _jettag_ws_copyFile_84_1.setTagInfo(_td_ws_copyFile_84_1);
        _jettag_ws_copyFile_84_1.doStart(context, out);
        _jettag_ws_copyFile_84_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_85_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_85_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_85_1.setRuntimeParent(null);
        _jettag_ws_copyFile_85_1.setTagInfo(_td_ws_copyFile_85_1);
        _jettag_ws_copyFile_85_1.doStart(context, out);
        _jettag_ws_copyFile_85_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_86_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_86_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_86_1.setRuntimeParent(null);
        _jettag_ws_copyFile_86_1.setTagInfo(_td_ws_copyFile_86_1);
        _jettag_ws_copyFile_86_1.doStart(context, out);
        _jettag_ws_copyFile_86_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_87_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_87_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_87_1.setRuntimeParent(null);
        _jettag_ws_copyFile_87_1.setTagInfo(_td_ws_copyFile_87_1);
        _jettag_ws_copyFile_87_1.doStart(context, out);
        _jettag_ws_copyFile_87_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_88_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_88_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_88_1.setRuntimeParent(null);
        _jettag_ws_copyFile_88_1.setTagInfo(_td_ws_copyFile_88_1);
        _jettag_ws_copyFile_88_1.doStart(context, out);
        _jettag_ws_copyFile_88_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_89_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_89_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_89_1.setRuntimeParent(null);
        _jettag_ws_copyFile_89_1.setTagInfo(_td_ws_copyFile_89_1);
        _jettag_ws_copyFile_89_1.doStart(context, out);
        _jettag_ws_copyFile_89_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_90_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_90_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_90_1.setRuntimeParent(null);
        _jettag_ws_copyFile_90_1.setTagInfo(_td_ws_copyFile_90_1);
        _jettag_ws_copyFile_90_1.doStart(context, out);
        _jettag_ws_copyFile_90_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_91_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_91_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_91_1.setRuntimeParent(null);
        _jettag_ws_copyFile_91_1.setTagInfo(_td_ws_copyFile_91_1);
        _jettag_ws_copyFile_91_1.doStart(context, out);
        _jettag_ws_copyFile_91_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_92_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_92_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_92_1.setRuntimeParent(null);
        _jettag_ws_copyFile_92_1.setTagInfo(_td_ws_copyFile_92_1);
        _jettag_ws_copyFile_92_1.doStart(context, out);
        _jettag_ws_copyFile_92_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_93_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_93_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_93_1.setRuntimeParent(null);
        _jettag_ws_copyFile_93_1.setTagInfo(_td_ws_copyFile_93_1);
        _jettag_ws_copyFile_93_1.doStart(context, out);
        _jettag_ws_copyFile_93_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_94_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_94_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_94_1.setRuntimeParent(null);
        _jettag_ws_copyFile_94_1.setTagInfo(_td_ws_copyFile_94_1);
        _jettag_ws_copyFile_94_1.doStart(context, out);
        _jettag_ws_copyFile_94_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_95_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_95_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_95_1.setRuntimeParent(null);
        _jettag_ws_copyFile_95_1.setTagInfo(_td_ws_copyFile_95_1);
        _jettag_ws_copyFile_95_1.doStart(context, out);
        _jettag_ws_copyFile_95_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_96_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_96_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_96_1.setRuntimeParent(null);
        _jettag_ws_copyFile_96_1.setTagInfo(_td_ws_copyFile_96_1);
        _jettag_ws_copyFile_96_1.doStart(context, out);
        _jettag_ws_copyFile_96_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_97_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_97_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_97_1.setRuntimeParent(null);
        _jettag_ws_copyFile_97_1.setTagInfo(_td_ws_copyFile_97_1);
        _jettag_ws_copyFile_97_1.doStart(context, out);
        _jettag_ws_copyFile_97_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_98_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_98_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_98_1.setRuntimeParent(null);
        _jettag_ws_copyFile_98_1.setTagInfo(_td_ws_copyFile_98_1);
        _jettag_ws_copyFile_98_1.doStart(context, out);
        _jettag_ws_copyFile_98_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_99_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_99_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_99_1.setRuntimeParent(null);
        _jettag_ws_copyFile_99_1.setTagInfo(_td_ws_copyFile_99_1);
        _jettag_ws_copyFile_99_1.doStart(context, out);
        _jettag_ws_copyFile_99_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_100_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_100_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_100_1.setRuntimeParent(null);
        _jettag_ws_copyFile_100_1.setTagInfo(_td_ws_copyFile_100_1);
        _jettag_ws_copyFile_100_1.doStart(context, out);
        _jettag_ws_copyFile_100_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_101_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_101_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_101_1.setRuntimeParent(null);
        _jettag_ws_copyFile_101_1.setTagInfo(_td_ws_copyFile_101_1);
        _jettag_ws_copyFile_101_1.doStart(context, out);
        _jettag_ws_copyFile_101_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_102_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_102_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_102_1.setRuntimeParent(null);
        _jettag_ws_copyFile_102_1.setTagInfo(_td_ws_copyFile_102_1);
        _jettag_ws_copyFile_102_1.doStart(context, out);
        _jettag_ws_copyFile_102_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_103_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_103_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_103_1.setRuntimeParent(null);
        _jettag_ws_copyFile_103_1.setTagInfo(_td_ws_copyFile_103_1);
        _jettag_ws_copyFile_103_1.doStart(context, out);
        _jettag_ws_copyFile_103_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_104_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_104_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_104_1.setRuntimeParent(null);
        _jettag_ws_copyFile_104_1.setTagInfo(_td_ws_copyFile_104_1);
        _jettag_ws_copyFile_104_1.doStart(context, out);
        _jettag_ws_copyFile_104_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_105_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_105_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_105_1.setRuntimeParent(null);
        _jettag_ws_copyFile_105_1.setTagInfo(_td_ws_copyFile_105_1);
        _jettag_ws_copyFile_105_1.doStart(context, out);
        _jettag_ws_copyFile_105_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_106_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_106_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_106_1.setRuntimeParent(null);
        _jettag_ws_copyFile_106_1.setTagInfo(_td_ws_copyFile_106_1);
        _jettag_ws_copyFile_106_1.doStart(context, out);
        _jettag_ws_copyFile_106_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_107_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_107_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_107_1.setRuntimeParent(null);
        _jettag_ws_copyFile_107_1.setTagInfo(_td_ws_copyFile_107_1);
        _jettag_ws_copyFile_107_1.doStart(context, out);
        _jettag_ws_copyFile_107_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_108_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_108_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_108_1.setRuntimeParent(null);
        _jettag_ws_copyFile_108_1.setTagInfo(_td_ws_copyFile_108_1);
        _jettag_ws_copyFile_108_1.doStart(context, out);
        _jettag_ws_copyFile_108_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_109_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_109_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_109_1.setRuntimeParent(null);
        _jettag_ws_copyFile_109_1.setTagInfo(_td_ws_copyFile_109_1);
        _jettag_ws_copyFile_109_1.doStart(context, out);
        _jettag_ws_copyFile_109_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_110_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_110_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_110_1.setRuntimeParent(null);
        _jettag_ws_copyFile_110_1.setTagInfo(_td_ws_copyFile_110_1);
        _jettag_ws_copyFile_110_1.doStart(context, out);
        _jettag_ws_copyFile_110_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_111_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_111_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_111_1.setRuntimeParent(null);
        _jettag_ws_copyFile_111_1.setTagInfo(_td_ws_copyFile_111_1);
        _jettag_ws_copyFile_111_1.doStart(context, out);
        _jettag_ws_copyFile_111_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_112_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_112_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_112_1.setRuntimeParent(null);
        _jettag_ws_copyFile_112_1.setTagInfo(_td_ws_copyFile_112_1);
        _jettag_ws_copyFile_112_1.doStart(context, out);
        _jettag_ws_copyFile_112_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_113_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_113_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_113_1.setRuntimeParent(null);
        _jettag_ws_copyFile_113_1.setTagInfo(_td_ws_copyFile_113_1);
        _jettag_ws_copyFile_113_1.doStart(context, out);
        _jettag_ws_copyFile_113_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_114_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_114_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_114_1.setRuntimeParent(null);
        _jettag_ws_copyFile_114_1.setTagInfo(_td_ws_copyFile_114_1);
        _jettag_ws_copyFile_114_1.doStart(context, out);
        _jettag_ws_copyFile_114_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_115_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_115_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_115_1.setRuntimeParent(null);
        _jettag_ws_copyFile_115_1.setTagInfo(_td_ws_copyFile_115_1);
        _jettag_ws_copyFile_115_1.doStart(context, out);
        _jettag_ws_copyFile_115_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_116_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_116_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_116_1.setRuntimeParent(null);
        _jettag_ws_copyFile_116_1.setTagInfo(_td_ws_copyFile_116_1);
        _jettag_ws_copyFile_116_1.doStart(context, out);
        _jettag_ws_copyFile_116_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_117_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_117_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_117_1.setRuntimeParent(null);
        _jettag_ws_copyFile_117_1.setTagInfo(_td_ws_copyFile_117_1);
        _jettag_ws_copyFile_117_1.doStart(context, out);
        _jettag_ws_copyFile_117_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_118_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_118_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_118_1.setRuntimeParent(null);
        _jettag_ws_copyFile_118_1.setTagInfo(_td_ws_copyFile_118_1);
        _jettag_ws_copyFile_118_1.doStart(context, out);
        _jettag_ws_copyFile_118_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_119_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_119_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_119_1.setRuntimeParent(null);
        _jettag_ws_copyFile_119_1.setTagInfo(_td_ws_copyFile_119_1);
        _jettag_ws_copyFile_119_1.doStart(context, out);
        _jettag_ws_copyFile_119_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_120_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_120_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_120_1.setRuntimeParent(null);
        _jettag_ws_copyFile_120_1.setTagInfo(_td_ws_copyFile_120_1);
        _jettag_ws_copyFile_120_1.doStart(context, out);
        _jettag_ws_copyFile_120_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_121_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_121_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_121_1.setRuntimeParent(null);
        _jettag_ws_copyFile_121_1.setTagInfo(_td_ws_copyFile_121_1);
        _jettag_ws_copyFile_121_1.doStart(context, out);
        _jettag_ws_copyFile_121_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_122_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_122_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_122_1.setRuntimeParent(null);
        _jettag_ws_copyFile_122_1.setTagInfo(_td_ws_copyFile_122_1);
        _jettag_ws_copyFile_122_1.doStart(context, out);
        _jettag_ws_copyFile_122_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_123_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_123_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_123_1.setRuntimeParent(null);
        _jettag_ws_copyFile_123_1.setTagInfo(_td_ws_copyFile_123_1);
        _jettag_ws_copyFile_123_1.doStart(context, out);
        _jettag_ws_copyFile_123_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_124_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_124_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_124_1.setRuntimeParent(null);
        _jettag_ws_copyFile_124_1.setTagInfo(_td_ws_copyFile_124_1);
        _jettag_ws_copyFile_124_1.doStart(context, out);
        _jettag_ws_copyFile_124_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_125_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_125_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_125_1.setRuntimeParent(null);
        _jettag_ws_copyFile_125_1.setTagInfo(_td_ws_copyFile_125_1);
        _jettag_ws_copyFile_125_1.doStart(context, out);
        _jettag_ws_copyFile_125_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_126_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_126_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_126_1.setRuntimeParent(null);
        _jettag_ws_copyFile_126_1.setTagInfo(_td_ws_copyFile_126_1);
        _jettag_ws_copyFile_126_1.doStart(context, out);
        _jettag_ws_copyFile_126_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_ws_copyFile_127_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "copyFile", "ws:copyFile", _td_ws_copyFile_127_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_copyFile_127_1.setRuntimeParent(null);
        _jettag_ws_copyFile_127_1.setTagInfo(_td_ws_copyFile_127_1);
        _jettag_ws_copyFile_127_1.doStart(context, out);
        _jettag_ws_copyFile_127_1.doEnd();
        out.write(NL);         
    }
}
