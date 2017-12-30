package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_java implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_java = "org.eclipse.jet.javaTags"; //$NON-NLS-1$
    private static final String _jetns_ws = "org.eclipse.jet.workspaceTags"; //$NON-NLS-1$

    public _jet_java() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_ws_folder_2_1 = new TagInfo("ws:folder", //$NON-NLS-1$
            2, 1,
            new String[] {
                "path", //$NON-NLS-1$
            },
            new String[] {
                "{$projectName}/cmi", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_package_15_1 = new TagInfo("java:package", //$NON-NLS-1$
            15, 1,
            new String[] {
                "name", //$NON-NLS-1$
                "srcFolder", //$NON-NLS-1$
            },
            new String[] {
                "{$packageName}.dao", //$NON-NLS-1$
                "{$projectName}/cmi", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_16_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            16, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eachTable", //$NON-NLS-1$
                "$table", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_class_18_1 = new TagInfo("java:class", //$NON-NLS-1$
            18, 1,
            new String[] {
                "name", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{uppercaseFirst($eachTable/@name)}DAO", //$NON-NLS-1$
                "templates/content/java/dao.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_class_21_1 = new TagInfo("java:class", //$NON-NLS-1$
            21, 1,
            new String[] {
                "name", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{uppercaseFirst($eachTable/@name)}DAOImpl", //$NON-NLS-1$
                "templates/content/java/daoImpl.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_class_25_1 = new TagInfo("java:class", //$NON-NLS-1$
            25, 1,
            new String[] {
                "name", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "AbstractJpaDao", //$NON-NLS-1$
                "templates/content/java/AbstractJpaDao.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_class_26_1 = new TagInfo("java:class", //$NON-NLS-1$
            26, 1,
            new String[] {
                "name", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "JpaDao", //$NON-NLS-1$
                "templates/content/java/JpaDao.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_package_30_1 = new TagInfo("java:package", //$NON-NLS-1$
            30, 1,
            new String[] {
                "name", //$NON-NLS-1$
                "srcFolder", //$NON-NLS-1$
            },
            new String[] {
                "{$packageName}.domain", //$NON-NLS-1$
                "{$projectName}/cmi", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_31_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            31, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eachTable", //$NON-NLS-1$
                "$table", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_class_34_1 = new TagInfo("java:class", //$NON-NLS-1$
            34, 1,
            new String[] {
                "name", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{uppercaseFirst($eachTable/@name)}", //$NON-NLS-1$
                "templates/content/java/domain.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_package_38_1 = new TagInfo("java:package", //$NON-NLS-1$
            38, 1,
            new String[] {
                "name", //$NON-NLS-1$
                "srcFolder", //$NON-NLS-1$
            },
            new String[] {
                "{$packageName}.service", //$NON-NLS-1$
                "{$projectName}/cmi", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_39_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            39, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eachTable", //$NON-NLS-1$
                "$table", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_40_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            40, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_41_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            41, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/columns/column", //$NON-NLS-1$
                "col", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_42_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            42, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$i+1", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_45_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            45, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_46_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            46, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/referenceds/referenced", //$NON-NLS-1$
                "ref", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_47_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            47, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$j+1", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_49_1 = new TagInfo("c:if", //$NON-NLS-1$
            49, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$i!=0 or $j!=0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_class_52_1 = new TagInfo("java:class", //$NON-NLS-1$
            52, 1,
            new String[] {
                "name", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{uppercaseFirst($eachTable/@name)}Service", //$NON-NLS-1$
                "templates/content/java/service.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_class_56_1 = new TagInfo("java:class", //$NON-NLS-1$
            56, 1,
            new String[] {
                "name", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{uppercaseFirst($eachTable/@name)}ServiceImpl", //$NON-NLS-1$
                "templates/content/java/serviceImpl.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_package_61_1 = new TagInfo("java:package", //$NON-NLS-1$
            61, 1,
            new String[] {
                "name", //$NON-NLS-1$
                "srcFolder", //$NON-NLS-1$
            },
            new String[] {
                "{$packageName}.web", //$NON-NLS-1$
                "{$projectName}/cmi", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_62_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            62, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eachTable", //$NON-NLS-1$
                "$table", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_63_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            63, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_64_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            64, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/columns/column", //$NON-NLS-1$
                "col", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_65_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            65, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$i+1", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_68_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            68, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_69_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            69, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/referenceds/referenced", //$NON-NLS-1$
                "ref", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_70_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            70, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$j+1", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_72_1 = new TagInfo("c:if", //$NON-NLS-1$
            72, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$i!=0 or $j!=0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_class_74_1 = new TagInfo("java:class", //$NON-NLS-1$
            74, 1,
            new String[] {
                "name", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{uppercaseFirst($eachTable/@name)}Controller", //$NON-NLS-1$
                "templates/content/java/controller.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_class_79_1 = new TagInfo("java:class", //$NON-NLS-1$
            79, 1,
            new String[] {
                "name", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "CmiController", //$NON-NLS-1$
                "templates/content/java/initBinder/CmiController.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_package_82_1 = new TagInfo("java:package", //$NON-NLS-1$
            82, 1,
            new String[] {
                "name", //$NON-NLS-1$
                "srcFolder", //$NON-NLS-1$
            },
            new String[] {
                "{$packageName}.RS", //$NON-NLS-1$
                "{$projectName}/cmi", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_83_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            83, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eachTable", //$NON-NLS-1$
                "$table", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_84_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            84, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_85_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            85, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/columns/column", //$NON-NLS-1$
                "col", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_86_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            86, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$i+1", //$NON-NLS-1$
                "i", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_89_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            89, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "0", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_90_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            90, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$eachTable/referenceds/referenced", //$NON-NLS-1$
                "ref", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_setVariable_91_1 = new TagInfo("c:setVariable", //$NON-NLS-1$
            91, 1,
            new String[] {
                "select", //$NON-NLS-1$
                "var", //$NON-NLS-1$
            },
            new String[] {
                "$j+1", //$NON-NLS-1$
                "j", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_93_1 = new TagInfo("c:if", //$NON-NLS-1$
            93, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "$i!=0 or $j!=0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_class_95_1 = new TagInfo("java:class", //$NON-NLS-1$
            95, 1,
            new String[] {
                "name", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{uppercaseFirst($eachTable/@name)}RestController", //$NON-NLS-1$
                "templates/content/java/rscontroller.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_package_101_1 = new TagInfo("java:package", //$NON-NLS-1$
            101, 1,
            new String[] {
                "name", //$NON-NLS-1$
                "srcFolder", //$NON-NLS-1$
            },
            new String[] {
                "{$packageName}.initBinder", //$NON-NLS-1$
                "{$projectName}/cmi", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_iterate_102_1 = new TagInfo("c:iterate", //$NON-NLS-1$
            102, 1,
            new String[] {
                "var", //$NON-NLS-1$
                "select", //$NON-NLS-1$
            },
            new String[] {
                "eachTable", //$NON-NLS-1$
                "$table", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_class_103_1 = new TagInfo("java:class", //$NON-NLS-1$
            103, 1,
            new String[] {
                "name", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{uppercaseFirst($eachTable/@name)}Editor", //$NON-NLS-1$
                "templates/content/java/initBinder/propertyEditor.jet", //$NON-NLS-1$
            } );
    private static final TagInfo _td_java_class_104_1 = new TagInfo("java:class", //$NON-NLS-1$
            104, 1,
            new String[] {
                "name", //$NON-NLS-1$
                "template", //$NON-NLS-1$
            },
            new String[] {
                "{uppercaseFirst($eachTable/@name)}sEditor", //$NON-NLS-1$
                "templates/content/java/initBinder/propertiesEditor.jet", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_ws_folder_2_1 = context.getTagFactory().createRuntimeTag(_jetns_ws, "folder", "ws:folder", _td_ws_folder_2_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_ws_folder_2_1.setRuntimeParent(null);
        _jettag_ws_folder_2_1.setTagInfo(_td_ws_folder_2_1);
        _jettag_ws_folder_2_1.doStart(context, out);
        _jettag_ws_folder_2_1.doEnd();
        //
        //<c:setVariable select="0" var="i"/>
        //<c:iterate select="$eachTable/columns/column" var="col">
        //<c:setVariable select="$i+1" var="i"/>
        //</c:iterate>
        //
        //<c:setVariable select="0" var="j"/>
        //<c:iterate select="$eachTable/referenceds/referenced" var="ref">
        //<c:setVariable select="$j+1" var="j"/>
        //</c:iterate>
        //<c:if test="$i!=0 or $j!=0">
        RuntimeTagElement _jettag_java_package_15_1 = context.getTagFactory().createRuntimeTag(_jetns_java, "package", "java:package", _td_java_package_15_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_package_15_1.setRuntimeParent(null);
        _jettag_java_package_15_1.setTagInfo(_td_java_package_15_1);
        _jettag_java_package_15_1.doStart(context, out);
        while (_jettag_java_package_15_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_iterate_16_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_16_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_16_1.setRuntimeParent(_jettag_java_package_15_1);
            _jettag_c_iterate_16_1.setTagInfo(_td_c_iterate_16_1);
            _jettag_c_iterate_16_1.doStart(context, out);
            while (_jettag_c_iterate_16_1.okToProcessBody()) {
                // 生成DAO 
                RuntimeTagElement _jettag_java_class_18_1 = context.getTagFactory().createRuntimeTag(_jetns_java, "class", "java:class", _td_java_class_18_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_class_18_1.setRuntimeParent(_jettag_c_iterate_16_1);
                _jettag_java_class_18_1.setTagInfo(_td_java_class_18_1);
                _jettag_java_class_18_1.doStart(context, out);
                _jettag_java_class_18_1.doEnd();
                out.write(NL);         
                out.write(NL);         
                // 生成DAOImpl 
                RuntimeTagElement _jettag_java_class_21_1 = context.getTagFactory().createRuntimeTag(_jetns_java, "class", "java:class", _td_java_class_21_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_class_21_1.setRuntimeParent(_jettag_c_iterate_16_1);
                _jettag_java_class_21_1.setTagInfo(_td_java_class_21_1);
                _jettag_java_class_21_1.doStart(context, out);
                _jettag_java_class_21_1.doEnd();
                out.write(NL);         
                _jettag_c_iterate_16_1.handleBodyContent(out);
            }
            _jettag_c_iterate_16_1.doEnd();
            out.write(NL);         
            // 生成JpaDao
            RuntimeTagElement _jettag_java_class_25_1 = context.getTagFactory().createRuntimeTag(_jetns_java, "class", "java:class", _td_java_class_25_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_java_class_25_1.setRuntimeParent(_jettag_java_package_15_1);
            _jettag_java_class_25_1.setTagInfo(_td_java_class_25_1);
            _jettag_java_class_25_1.doStart(context, out);
            _jettag_java_class_25_1.doEnd();
            out.write(NL);         
            RuntimeTagElement _jettag_java_class_26_1 = context.getTagFactory().createRuntimeTag(_jetns_java, "class", "java:class", _td_java_class_26_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_java_class_26_1.setRuntimeParent(_jettag_java_package_15_1);
            _jettag_java_class_26_1.setTagInfo(_td_java_class_26_1);
            _jettag_java_class_26_1.doStart(context, out);
            _jettag_java_class_26_1.doEnd();
            out.write(NL);         
            out.write(NL);         
            _jettag_java_package_15_1.handleBodyContent(out);
        }
        _jettag_java_package_15_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_java_package_30_1 = context.getTagFactory().createRuntimeTag(_jetns_java, "package", "java:package", _td_java_package_30_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_package_30_1.setRuntimeParent(null);
        _jettag_java_package_30_1.setTagInfo(_td_java_package_30_1);
        _jettag_java_package_30_1.doStart(context, out);
        while (_jettag_java_package_30_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_iterate_31_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_31_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_31_1.setRuntimeParent(_jettag_java_package_30_1);
            _jettag_c_iterate_31_1.setTagInfo(_td_c_iterate_31_1);
            _jettag_c_iterate_31_1.doStart(context, out);
            while (_jettag_c_iterate_31_1.okToProcessBody()) {
                // 生成domain 
                //<ws:file template="templates/content/java/class/domain/domain.jet" path="{$projectName}/generated/{$packageName}.daomain/{uppercaseFirst($eachTable/@name)}.java"/>
                RuntimeTagElement _jettag_java_class_34_1 = context.getTagFactory().createRuntimeTag(_jetns_java, "class", "java:class", _td_java_class_34_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_class_34_1.setRuntimeParent(_jettag_c_iterate_31_1);
                _jettag_java_class_34_1.setTagInfo(_td_java_class_34_1);
                _jettag_java_class_34_1.doStart(context, out);
                _jettag_java_class_34_1.doEnd();
                out.write(NL);         
                _jettag_c_iterate_31_1.handleBodyContent(out);
            }
            _jettag_c_iterate_31_1.doEnd();
            _jettag_java_package_30_1.handleBodyContent(out);
        }
        _jettag_java_package_30_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_java_package_38_1 = context.getTagFactory().createRuntimeTag(_jetns_java, "package", "java:package", _td_java_package_38_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_package_38_1.setRuntimeParent(null);
        _jettag_java_package_38_1.setTagInfo(_td_java_package_38_1);
        _jettag_java_package_38_1.doStart(context, out);
        while (_jettag_java_package_38_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_iterate_39_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_39_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_39_1.setRuntimeParent(_jettag_java_package_38_1);
            _jettag_c_iterate_39_1.setTagInfo(_td_c_iterate_39_1);
            _jettag_c_iterate_39_1.doStart(context, out);
            while (_jettag_c_iterate_39_1.okToProcessBody()) {
                RuntimeTagElement _jettag_c_setVariable_40_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_40_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_40_1.setRuntimeParent(_jettag_c_iterate_39_1);
                _jettag_c_setVariable_40_1.setTagInfo(_td_c_setVariable_40_1);
                _jettag_c_setVariable_40_1.doStart(context, out);
                _jettag_c_setVariable_40_1.doEnd();
                RuntimeTagElement _jettag_c_iterate_41_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_41_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_41_1.setRuntimeParent(_jettag_c_iterate_39_1);
                _jettag_c_iterate_41_1.setTagInfo(_td_c_iterate_41_1);
                _jettag_c_iterate_41_1.doStart(context, out);
                while (_jettag_c_iterate_41_1.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_setVariable_42_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_42_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_42_1.setRuntimeParent(_jettag_c_iterate_41_1);
                    _jettag_c_setVariable_42_1.setTagInfo(_td_c_setVariable_42_1);
                    _jettag_c_setVariable_42_1.doStart(context, out);
                    _jettag_c_setVariable_42_1.doEnd();
                    _jettag_c_iterate_41_1.handleBodyContent(out);
                }
                _jettag_c_iterate_41_1.doEnd();
                out.write(NL);         
                RuntimeTagElement _jettag_c_setVariable_45_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_45_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_45_1.setRuntimeParent(_jettag_c_iterate_39_1);
                _jettag_c_setVariable_45_1.setTagInfo(_td_c_setVariable_45_1);
                _jettag_c_setVariable_45_1.doStart(context, out);
                _jettag_c_setVariable_45_1.doEnd();
                RuntimeTagElement _jettag_c_iterate_46_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_46_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_46_1.setRuntimeParent(_jettag_c_iterate_39_1);
                _jettag_c_iterate_46_1.setTagInfo(_td_c_iterate_46_1);
                _jettag_c_iterate_46_1.doStart(context, out);
                while (_jettag_c_iterate_46_1.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_setVariable_47_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_47_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_47_1.setRuntimeParent(_jettag_c_iterate_46_1);
                    _jettag_c_setVariable_47_1.setTagInfo(_td_c_setVariable_47_1);
                    _jettag_c_setVariable_47_1.doStart(context, out);
                    _jettag_c_setVariable_47_1.doEnd();
                    _jettag_c_iterate_46_1.handleBodyContent(out);
                }
                _jettag_c_iterate_46_1.doEnd();
                RuntimeTagElement _jettag_c_if_49_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_49_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_49_1.setRuntimeParent(_jettag_c_iterate_39_1);
                _jettag_c_if_49_1.setTagInfo(_td_c_if_49_1);
                _jettag_c_if_49_1.doStart(context, out);
                while (_jettag_c_if_49_1.okToProcessBody()) {
                    // 生成Service 
                    //<ws:file template="templates/content/java/class/service/service.jet" path="{$projectName}/generated/{$packageName}.service/{uppercaseFirst($eachTable/@name)}Service.java"/>
                    RuntimeTagElement _jettag_java_class_52_1 = context.getTagFactory().createRuntimeTag(_jetns_java, "class", "java:class", _td_java_class_52_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_class_52_1.setRuntimeParent(_jettag_c_if_49_1);
                    _jettag_java_class_52_1.setTagInfo(_td_java_class_52_1);
                    _jettag_java_class_52_1.doStart(context, out);
                    _jettag_java_class_52_1.doEnd();
                    out.write(NL);         
                    out.write(NL);         
                    // 生成ServiceImpl 
                    //<ws:file template="templates/content/java/class/serviceImpl/serviceImpl.jet" path="{$projectName}/generated/{$packageName}.service/{uppercaseFirst($eachTable/@name)}ServiceImpl.java"/>
                    RuntimeTagElement _jettag_java_class_56_1 = context.getTagFactory().createRuntimeTag(_jetns_java, "class", "java:class", _td_java_class_56_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_class_56_1.setRuntimeParent(_jettag_c_if_49_1);
                    _jettag_java_class_56_1.setTagInfo(_td_java_class_56_1);
                    _jettag_java_class_56_1.doStart(context, out);
                    _jettag_java_class_56_1.doEnd();
                    out.write(NL);         
                    _jettag_c_if_49_1.handleBodyContent(out);
                }
                _jettag_c_if_49_1.doEnd();
                _jettag_c_iterate_39_1.handleBodyContent(out);
            }
            _jettag_c_iterate_39_1.doEnd();
            _jettag_java_package_38_1.handleBodyContent(out);
        }
        _jettag_java_package_38_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_java_package_61_1 = context.getTagFactory().createRuntimeTag(_jetns_java, "package", "java:package", _td_java_package_61_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_package_61_1.setRuntimeParent(null);
        _jettag_java_package_61_1.setTagInfo(_td_java_package_61_1);
        _jettag_java_package_61_1.doStart(context, out);
        while (_jettag_java_package_61_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_iterate_62_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_62_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_62_1.setRuntimeParent(_jettag_java_package_61_1);
            _jettag_c_iterate_62_1.setTagInfo(_td_c_iterate_62_1);
            _jettag_c_iterate_62_1.doStart(context, out);
            while (_jettag_c_iterate_62_1.okToProcessBody()) {
                RuntimeTagElement _jettag_c_setVariable_63_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_63_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_63_1.setRuntimeParent(_jettag_c_iterate_62_1);
                _jettag_c_setVariable_63_1.setTagInfo(_td_c_setVariable_63_1);
                _jettag_c_setVariable_63_1.doStart(context, out);
                _jettag_c_setVariable_63_1.doEnd();
                RuntimeTagElement _jettag_c_iterate_64_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_64_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_64_1.setRuntimeParent(_jettag_c_iterate_62_1);
                _jettag_c_iterate_64_1.setTagInfo(_td_c_iterate_64_1);
                _jettag_c_iterate_64_1.doStart(context, out);
                while (_jettag_c_iterate_64_1.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_setVariable_65_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_65_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_65_1.setRuntimeParent(_jettag_c_iterate_64_1);
                    _jettag_c_setVariable_65_1.setTagInfo(_td_c_setVariable_65_1);
                    _jettag_c_setVariable_65_1.doStart(context, out);
                    _jettag_c_setVariable_65_1.doEnd();
                    _jettag_c_iterate_64_1.handleBodyContent(out);
                }
                _jettag_c_iterate_64_1.doEnd();
                out.write(NL);         
                RuntimeTagElement _jettag_c_setVariable_68_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_68_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_68_1.setRuntimeParent(_jettag_c_iterate_62_1);
                _jettag_c_setVariable_68_1.setTagInfo(_td_c_setVariable_68_1);
                _jettag_c_setVariable_68_1.doStart(context, out);
                _jettag_c_setVariable_68_1.doEnd();
                RuntimeTagElement _jettag_c_iterate_69_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_69_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_69_1.setRuntimeParent(_jettag_c_iterate_62_1);
                _jettag_c_iterate_69_1.setTagInfo(_td_c_iterate_69_1);
                _jettag_c_iterate_69_1.doStart(context, out);
                while (_jettag_c_iterate_69_1.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_setVariable_70_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_70_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_70_1.setRuntimeParent(_jettag_c_iterate_69_1);
                    _jettag_c_setVariable_70_1.setTagInfo(_td_c_setVariable_70_1);
                    _jettag_c_setVariable_70_1.doStart(context, out);
                    _jettag_c_setVariable_70_1.doEnd();
                    _jettag_c_iterate_69_1.handleBodyContent(out);
                }
                _jettag_c_iterate_69_1.doEnd();
                RuntimeTagElement _jettag_c_if_72_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_72_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_72_1.setRuntimeParent(_jettag_c_iterate_62_1);
                _jettag_c_if_72_1.setTagInfo(_td_c_if_72_1);
                _jettag_c_if_72_1.doStart(context, out);
                while (_jettag_c_if_72_1.okToProcessBody()) {
                    // 生成Controller 
                    RuntimeTagElement _jettag_java_class_74_1 = context.getTagFactory().createRuntimeTag(_jetns_java, "class", "java:class", _td_java_class_74_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_class_74_1.setRuntimeParent(_jettag_c_if_72_1);
                    _jettag_java_class_74_1.setTagInfo(_td_java_class_74_1);
                    _jettag_java_class_74_1.doStart(context, out);
                    _jettag_java_class_74_1.doEnd();
                    out.write(NL);         
                    _jettag_c_if_72_1.handleBodyContent(out);
                }
                _jettag_c_if_72_1.doEnd();
                _jettag_c_iterate_62_1.handleBodyContent(out);
            }
            _jettag_c_iterate_62_1.doEnd();
            out.write(NL);         
            // 生成绑定器 
            RuntimeTagElement _jettag_java_class_79_1 = context.getTagFactory().createRuntimeTag(_jetns_java, "class", "java:class", _td_java_class_79_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_java_class_79_1.setRuntimeParent(_jettag_java_package_61_1);
            _jettag_java_class_79_1.setTagInfo(_td_java_class_79_1);
            _jettag_java_class_79_1.doStart(context, out);
            _jettag_java_class_79_1.doEnd();
            out.write(NL);         
            _jettag_java_package_61_1.handleBodyContent(out);
        }
        _jettag_java_package_61_1.doEnd();
        out.write(NL);         
        RuntimeTagElement _jettag_java_package_82_1 = context.getTagFactory().createRuntimeTag(_jetns_java, "package", "java:package", _td_java_package_82_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_package_82_1.setRuntimeParent(null);
        _jettag_java_package_82_1.setTagInfo(_td_java_package_82_1);
        _jettag_java_package_82_1.doStart(context, out);
        while (_jettag_java_package_82_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_iterate_83_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_83_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_83_1.setRuntimeParent(_jettag_java_package_82_1);
            _jettag_c_iterate_83_1.setTagInfo(_td_c_iterate_83_1);
            _jettag_c_iterate_83_1.doStart(context, out);
            while (_jettag_c_iterate_83_1.okToProcessBody()) {
                RuntimeTagElement _jettag_c_setVariable_84_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_84_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_84_1.setRuntimeParent(_jettag_c_iterate_83_1);
                _jettag_c_setVariable_84_1.setTagInfo(_td_c_setVariable_84_1);
                _jettag_c_setVariable_84_1.doStart(context, out);
                _jettag_c_setVariable_84_1.doEnd();
                RuntimeTagElement _jettag_c_iterate_85_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_85_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_85_1.setRuntimeParent(_jettag_c_iterate_83_1);
                _jettag_c_iterate_85_1.setTagInfo(_td_c_iterate_85_1);
                _jettag_c_iterate_85_1.doStart(context, out);
                while (_jettag_c_iterate_85_1.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_setVariable_86_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_86_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_86_1.setRuntimeParent(_jettag_c_iterate_85_1);
                    _jettag_c_setVariable_86_1.setTagInfo(_td_c_setVariable_86_1);
                    _jettag_c_setVariable_86_1.doStart(context, out);
                    _jettag_c_setVariable_86_1.doEnd();
                    _jettag_c_iterate_85_1.handleBodyContent(out);
                }
                _jettag_c_iterate_85_1.doEnd();
                out.write(NL);         
                RuntimeTagElement _jettag_c_setVariable_89_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_89_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_setVariable_89_1.setRuntimeParent(_jettag_c_iterate_83_1);
                _jettag_c_setVariable_89_1.setTagInfo(_td_c_setVariable_89_1);
                _jettag_c_setVariable_89_1.doStart(context, out);
                _jettag_c_setVariable_89_1.doEnd();
                RuntimeTagElement _jettag_c_iterate_90_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_90_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_iterate_90_1.setRuntimeParent(_jettag_c_iterate_83_1);
                _jettag_c_iterate_90_1.setTagInfo(_td_c_iterate_90_1);
                _jettag_c_iterate_90_1.doStart(context, out);
                while (_jettag_c_iterate_90_1.okToProcessBody()) {
                    RuntimeTagElement _jettag_c_setVariable_91_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "setVariable", "c:setVariable", _td_c_setVariable_91_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_c_setVariable_91_1.setRuntimeParent(_jettag_c_iterate_90_1);
                    _jettag_c_setVariable_91_1.setTagInfo(_td_c_setVariable_91_1);
                    _jettag_c_setVariable_91_1.doStart(context, out);
                    _jettag_c_setVariable_91_1.doEnd();
                    _jettag_c_iterate_90_1.handleBodyContent(out);
                }
                _jettag_c_iterate_90_1.doEnd();
                RuntimeTagElement _jettag_c_if_93_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_93_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_if_93_1.setRuntimeParent(_jettag_c_iterate_83_1);
                _jettag_c_if_93_1.setTagInfo(_td_c_if_93_1);
                _jettag_c_if_93_1.doStart(context, out);
                while (_jettag_c_if_93_1.okToProcessBody()) {
                    // 生成RSController 
                    RuntimeTagElement _jettag_java_class_95_1 = context.getTagFactory().createRuntimeTag(_jetns_java, "class", "java:class", _td_java_class_95_1); //$NON-NLS-1$ //$NON-NLS-2$
                    _jettag_java_class_95_1.setRuntimeParent(_jettag_c_if_93_1);
                    _jettag_java_class_95_1.setTagInfo(_td_java_class_95_1);
                    _jettag_java_class_95_1.doStart(context, out);
                    _jettag_java_class_95_1.doEnd();
                    out.write(NL);         
                    _jettag_c_if_93_1.handleBodyContent(out);
                }
                _jettag_c_if_93_1.doEnd();
                _jettag_c_iterate_83_1.handleBodyContent(out);
            }
            _jettag_c_iterate_83_1.doEnd();
            _jettag_java_package_82_1.handleBodyContent(out);
        }
        _jettag_java_package_82_1.doEnd();
        out.write(NL);         
        //生成绑定器的每一个类
        RuntimeTagElement _jettag_java_package_101_1 = context.getTagFactory().createRuntimeTag(_jetns_java, "package", "java:package", _td_java_package_101_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_java_package_101_1.setRuntimeParent(null);
        _jettag_java_package_101_1.setTagInfo(_td_java_package_101_1);
        _jettag_java_package_101_1.doStart(context, out);
        while (_jettag_java_package_101_1.okToProcessBody()) {
            RuntimeTagElement _jettag_c_iterate_102_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "iterate", "c:iterate", _td_c_iterate_102_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_iterate_102_1.setRuntimeParent(_jettag_java_package_101_1);
            _jettag_c_iterate_102_1.setTagInfo(_td_c_iterate_102_1);
            _jettag_c_iterate_102_1.doStart(context, out);
            while (_jettag_c_iterate_102_1.okToProcessBody()) {
                RuntimeTagElement _jettag_java_class_103_1 = context.getTagFactory().createRuntimeTag(_jetns_java, "class", "java:class", _td_java_class_103_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_class_103_1.setRuntimeParent(_jettag_c_iterate_102_1);
                _jettag_java_class_103_1.setTagInfo(_td_java_class_103_1);
                _jettag_java_class_103_1.doStart(context, out);
                _jettag_java_class_103_1.doEnd();
                out.write(NL);         
                RuntimeTagElement _jettag_java_class_104_1 = context.getTagFactory().createRuntimeTag(_jetns_java, "class", "java:class", _td_java_class_104_1); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_java_class_104_1.setRuntimeParent(_jettag_c_iterate_102_1);
                _jettag_java_class_104_1.setTagInfo(_td_java_class_104_1);
                _jettag_java_class_104_1.doStart(context, out);
                _jettag_java_class_104_1.doEnd();
                out.write(NL);         
                _jettag_c_iterate_102_1.handleBodyContent(out);
            }
            _jettag_c_iterate_102_1.doEnd();
            _jettag_java_package_101_1.handleBodyContent(out);
        }
        _jettag_java_package_101_1.doEnd();
        //</c:if>
    }
}
