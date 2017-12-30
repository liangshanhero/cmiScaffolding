package cn.edu.scau.cmi.jet.compiled;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2TemplateLoader;
import org.eclipse.jet.JET2TemplateLoaderExtension;

public class _jet_transformation implements JET2TemplateLoader,
        JET2TemplateLoaderExtension {

    private JET2TemplateLoader delegate = null;

    private final static Map<String, Integer> pathToTemplateOrdinalMap = new HashMap<String,Integer>(137);
    static {
        pathToTemplateOrdinalMap.put("templates/content/configure/MANIFEST.MF.jet", //$NON-NLS-1$
                Integer.valueOf(0));
        pathToTemplateOrdinalMap.put("templates/content/configure/appengine-web.xml.jet", //$NON-NLS-1$
                Integer.valueOf(1));
        pathToTemplateOrdinalMap.put("templates/content/configure/application-bundles.jet", //$NON-NLS-1$
                Integer.valueOf(2));
        pathToTemplateOrdinalMap.put("templates/content/configure/applicationContext.xml.jet", //$NON-NLS-1$
                Integer.valueOf(3));
        pathToTemplateOrdinalMap.put("templates/content/configure/classpath.jet", //$NON-NLS-1$
                Integer.valueOf(4));
        pathToTemplateOrdinalMap.put("templates/content/configure/com.genuitec.runtime.libraries.xml.jet", //$NON-NLS-1$
                Integer.valueOf(5));
        pathToTemplateOrdinalMap.put("templates/content/configure/dao-context.jet", //$NON-NLS-1$
                Integer.valueOf(6));
        pathToTemplateOrdinalMap.put("templates/content/configure/dao-property.jet", //$NON-NLS-1$
                Integer.valueOf(7));
        pathToTemplateOrdinalMap.put("templates/content/configure/decorators.jet", //$NON-NLS-1$
                Integer.valueOf(8));
        pathToTemplateOrdinalMap.put("templates/content/configure/entity-bundles.jet", //$NON-NLS-1$
                Integer.valueOf(9));
        pathToTemplateOrdinalMap.put("templates/content/configure/hibemateProperties.jet", //$NON-NLS-1$
                Integer.valueOf(10));
        pathToTemplateOrdinalMap.put("templates/content/configure/jaxws-web-context.jet", //$NON-NLS-1$
                Integer.valueOf(11));
        pathToTemplateOrdinalMap.put("templates/content/configure/jtaProperties.jet", //$NON-NLS-1$
                Integer.valueOf(12));
        pathToTemplateOrdinalMap.put("templates/content/configure/log4jProperties.jet", //$NON-NLS-1$
                Integer.valueOf(13));
        pathToTemplateOrdinalMap.put("templates/content/configure/merge.jet", //$NON-NLS-1$
                Integer.valueOf(14));
        pathToTemplateOrdinalMap.put("templates/content/configure/org.eclipse.jdt.core.prefs.jet", //$NON-NLS-1$
                Integer.valueOf(15));
        pathToTemplateOrdinalMap.put("templates/content/configure/org.eclipse.wst.common.component.jet", //$NON-NLS-1$
                Integer.valueOf(16));
        pathToTemplateOrdinalMap.put("templates/content/configure/org.eclipse.wst.common.project.facet.core.prefs.xml.jet", //$NON-NLS-1$
                Integer.valueOf(17));
        pathToTemplateOrdinalMap.put("templates/content/configure/org.eclipse.wst.common.project.facet.core.xml.jet", //$NON-NLS-1$
                Integer.valueOf(18));
        pathToTemplateOrdinalMap.put("templates/content/configure/persistence.jet", //$NON-NLS-1$
                Integer.valueOf(19));
        pathToTemplateOrdinalMap.put("templates/content/configure/project.jet", //$NON-NLS-1$
                Integer.valueOf(20));
        pathToTemplateOrdinalMap.put("templates/content/configure/security-context.jet", //$NON-NLS-1$
                Integer.valueOf(21));
        pathToTemplateOrdinalMap.put("templates/content/configure/service-context.jet", //$NON-NLS-1$
                Integer.valueOf(22));
        pathToTemplateOrdinalMap.put("templates/content/configure/spring-form.tld.jet", //$NON-NLS-1$
                Integer.valueOf(23));
        pathToTemplateOrdinalMap.put("templates/content/configure/spring.tld.jet", //$NON-NLS-1$
                Integer.valueOf(24));
        pathToTemplateOrdinalMap.put("templates/content/configure/springBeans.jet", //$NON-NLS-1$
                Integer.valueOf(25));
        pathToTemplateOrdinalMap.put("templates/content/configure/web-context.jet", //$NON-NLS-1$
                Integer.valueOf(26));
        pathToTemplateOrdinalMap.put("templates/content/configure/webxml.jet", //$NON-NLS-1$
                Integer.valueOf(27));
        pathToTemplateOrdinalMap.put("templates/content/java/AbstractJpaDao.jet", //$NON-NLS-1$
                Integer.valueOf(28));
        pathToTemplateOrdinalMap.put("templates/content/java/EntityEditor.jet", //$NON-NLS-1$
                Integer.valueOf(29));
        pathToTemplateOrdinalMap.put("templates/content/java/JpaDao.jet", //$NON-NLS-1$
                Integer.valueOf(30));
        pathToTemplateOrdinalMap.put("templates/content/java/controller.jet", //$NON-NLS-1$
                Integer.valueOf(31));
        pathToTemplateOrdinalMap.put("templates/content/java/dao.jet", //$NON-NLS-1$
                Integer.valueOf(32));
        pathToTemplateOrdinalMap.put("templates/content/java/daoImpl.jet", //$NON-NLS-1$
                Integer.valueOf(33));
        pathToTemplateOrdinalMap.put("templates/content/java/domain.jet", //$NON-NLS-1$
                Integer.valueOf(34));
        pathToTemplateOrdinalMap.put("templates/content/java/initBinder/CmiController.jet", //$NON-NLS-1$
                Integer.valueOf(35));
        pathToTemplateOrdinalMap.put("templates/content/java/initBinder/propertiesEditor.jet", //$NON-NLS-1$
                Integer.valueOf(36));
        pathToTemplateOrdinalMap.put("templates/content/java/initBinder/propertyEditor.jet", //$NON-NLS-1$
                Integer.valueOf(37));
        pathToTemplateOrdinalMap.put("templates/content/java/method/controller/confirmDeleteEntity.jet", //$NON-NLS-1$
                Integer.valueOf(38));
        pathToTemplateOrdinalMap.put("templates/content/java/method/controller/deleteEntity.jet", //$NON-NLS-1$
                Integer.valueOf(39));
        pathToTemplateOrdinalMap.put("templates/content/java/method/controller/editEntity.jet", //$NON-NLS-1$
                Integer.valueOf(40));
        pathToTemplateOrdinalMap.put("templates/content/java/method/controller/indexEntity.jet", //$NON-NLS-1$
                Integer.valueOf(41));
        pathToTemplateOrdinalMap.put("templates/content/java/method/controller/listEntity.jet", //$NON-NLS-1$
                Integer.valueOf(42));
        pathToTemplateOrdinalMap.put("templates/content/java/method/controller/newEntity.jet", //$NON-NLS-1$
                Integer.valueOf(43));
        pathToTemplateOrdinalMap.put("templates/content/java/method/controller/saveEntity.jet", //$NON-NLS-1$
                Integer.valueOf(44));
        pathToTemplateOrdinalMap.put("templates/content/java/method/controller/selectEntity.jet", //$NON-NLS-1$
                Integer.valueOf(45));
        pathToTemplateOrdinalMap.put("templates/content/java/method/controller/streamBinary.jet", //$NON-NLS-1$
                Integer.valueOf(46));
        pathToTemplateOrdinalMap.put("templates/content/java/method/controller/variable.jet", //$NON-NLS-1$
                Integer.valueOf(47));
        pathToTemplateOrdinalMap.put("templates/content/java/method/dao/findAllEntity.jet", //$NON-NLS-1$
                Integer.valueOf(48));
        pathToTemplateOrdinalMap.put("templates/content/java/method/dao/findEntityByAttributeColumns.jet", //$NON-NLS-1$
                Integer.valueOf(49));
        pathToTemplateOrdinalMap.put("templates/content/java/method/dao/findEntityByPrimaryKey.jet", //$NON-NLS-1$
                Integer.valueOf(50));
        pathToTemplateOrdinalMap.put("templates/content/java/method/dao/findEntityByPrimaryKeyColumns.jet", //$NON-NLS-1$
                Integer.valueOf(51));
        pathToTemplateOrdinalMap.put("templates/content/java/method/daoImpl/canBeMerged.jet", //$NON-NLS-1$
                Integer.valueOf(52));
        pathToTemplateOrdinalMap.put("templates/content/java/method/daoImpl/constructedFunction.jet", //$NON-NLS-1$
                Integer.valueOf(53));
        pathToTemplateOrdinalMap.put("templates/content/java/method/daoImpl/entityManager.jet", //$NON-NLS-1$
                Integer.valueOf(54));
        pathToTemplateOrdinalMap.put("templates/content/java/method/daoImpl/findAllEntity.jet", //$NON-NLS-1$
                Integer.valueOf(55));
        pathToTemplateOrdinalMap.put("templates/content/java/method/daoImpl/findEntityByAttributeColumns.jet", //$NON-NLS-1$
                Integer.valueOf(56));
        pathToTemplateOrdinalMap.put("templates/content/java/method/daoImpl/findEntityByPrimaryKey.jet", //$NON-NLS-1$
                Integer.valueOf(57));
        pathToTemplateOrdinalMap.put("templates/content/java/method/daoImpl/findEntityByPrimaryKeyColumns.jet", //$NON-NLS-1$
                Integer.valueOf(58));
        pathToTemplateOrdinalMap.put("templates/content/java/method/daoImpl/genericity.jet", //$NON-NLS-1$
                Integer.valueOf(59));
        pathToTemplateOrdinalMap.put("templates/content/java/method/daoImpl/variable.jet", //$NON-NLS-1$
                Integer.valueOf(60));
        pathToTemplateOrdinalMap.put("templates/content/java/method/daomain/copy.jet", //$NON-NLS-1$
                Integer.valueOf(61));
        pathToTemplateOrdinalMap.put("templates/content/java/method/daomain/equals.jet", //$NON-NLS-1$
                Integer.valueOf(62));
        pathToTemplateOrdinalMap.put("templates/content/java/method/daomain/getAndSet.jet", //$NON-NLS-1$
                Integer.valueOf(63));
        pathToTemplateOrdinalMap.put("templates/content/java/method/daomain/hashCode.jet", //$NON-NLS-1$
                Integer.valueOf(64));
        pathToTemplateOrdinalMap.put("templates/content/java/method/daomain/namedQuery.jet", //$NON-NLS-1$
                Integer.valueOf(65));
        pathToTemplateOrdinalMap.put("templates/content/java/method/daomain/toString.jet", //$NON-NLS-1$
                Integer.valueOf(66));
        pathToTemplateOrdinalMap.put("templates/content/java/method/daomain/variable.jet", //$NON-NLS-1$
                Integer.valueOf(67));
        pathToTemplateOrdinalMap.put("templates/content/java/method/rscontroller/delete.jet", //$NON-NLS-1$
                Integer.valueOf(68));
        pathToTemplateOrdinalMap.put("templates/content/java/method/rscontroller/get.jet", //$NON-NLS-1$
                Integer.valueOf(69));
        pathToTemplateOrdinalMap.put("templates/content/java/method/rscontroller/list.jet", //$NON-NLS-1$
                Integer.valueOf(70));
        pathToTemplateOrdinalMap.put("templates/content/java/method/rscontroller/load.jet", //$NON-NLS-1$
                Integer.valueOf(71));
        pathToTemplateOrdinalMap.put("templates/content/java/method/rscontroller/new.jet", //$NON-NLS-1$
                Integer.valueOf(72));
        pathToTemplateOrdinalMap.put("templates/content/java/method/rscontroller/save.jet", //$NON-NLS-1$
                Integer.valueOf(73));
        pathToTemplateOrdinalMap.put("templates/content/java/method/rscontroller/variable.jet", //$NON-NLS-1$
                Integer.valueOf(74));
        pathToTemplateOrdinalMap.put("templates/content/java/method/service/countEntity.jet", //$NON-NLS-1$
                Integer.valueOf(75));
        pathToTemplateOrdinalMap.put("templates/content/java/method/service/deleteEntity.jet", //$NON-NLS-1$
                Integer.valueOf(76));
        pathToTemplateOrdinalMap.put("templates/content/java/method/service/findAllEntity.jet", //$NON-NLS-1$
                Integer.valueOf(77));
        pathToTemplateOrdinalMap.put("templates/content/java/method/service/findEntityByPrimaryKey.jet", //$NON-NLS-1$
                Integer.valueOf(78));
        pathToTemplateOrdinalMap.put("templates/content/java/method/service/loadEntity.jet", //$NON-NLS-1$
                Integer.valueOf(79));
        pathToTemplateOrdinalMap.put("templates/content/java/method/service/saveEntity.jet", //$NON-NLS-1$
                Integer.valueOf(80));
        pathToTemplateOrdinalMap.put("templates/content/java/method/serviceImpl/countEntity.jet", //$NON-NLS-1$
                Integer.valueOf(81));
        pathToTemplateOrdinalMap.put("templates/content/java/method/serviceImpl/deleteEntity.jet", //$NON-NLS-1$
                Integer.valueOf(82));
        pathToTemplateOrdinalMap.put("templates/content/java/method/serviceImpl/findAllEntity.jet", //$NON-NLS-1$
                Integer.valueOf(83));
        pathToTemplateOrdinalMap.put("templates/content/java/method/serviceImpl/findEntityByPrimaryKey.jet", //$NON-NLS-1$
                Integer.valueOf(84));
        pathToTemplateOrdinalMap.put("templates/content/java/method/serviceImpl/loadEntity.jet", //$NON-NLS-1$
                Integer.valueOf(85));
        pathToTemplateOrdinalMap.put("templates/content/java/method/serviceImpl/saveEntity.jet", //$NON-NLS-1$
                Integer.valueOf(86));
        pathToTemplateOrdinalMap.put("templates/content/java/method/serviceImpl/variable.jet", //$NON-NLS-1$
                Integer.valueOf(87));
        pathToTemplateOrdinalMap.put("templates/content/java/rscontroller.jet", //$NON-NLS-1$
                Integer.valueOf(88));
        pathToTemplateOrdinalMap.put("templates/content/java/service.jet", //$NON-NLS-1$
                Integer.valueOf(89));
        pathToTemplateOrdinalMap.put("templates/content/java/serviceImpl.jet", //$NON-NLS-1$
                Integer.valueOf(90));
        pathToTemplateOrdinalMap.put("templates/content/jsp/delete.jet", //$NON-NLS-1$
                Integer.valueOf(91));
        pathToTemplateOrdinalMap.put("templates/content/jsp/deleteRelate.jet", //$NON-NLS-1$
                Integer.valueOf(92));
        pathToTemplateOrdinalMap.put("templates/content/jsp/edit.jet", //$NON-NLS-1$
                Integer.valueOf(93));
        pathToTemplateOrdinalMap.put("templates/content/jsp/editRelate.jet", //$NON-NLS-1$
                Integer.valueOf(94));
        pathToTemplateOrdinalMap.put("templates/content/jsp/fragment/delete/body.jet", //$NON-NLS-1$
                Integer.valueOf(95));
        pathToTemplateOrdinalMap.put("templates/content/jsp/fragment/delete/tbody.jet", //$NON-NLS-1$
                Integer.valueOf(96));
        pathToTemplateOrdinalMap.put("templates/content/jsp/fragment/deleteRelate/body.jet", //$NON-NLS-1$
                Integer.valueOf(97));
        pathToTemplateOrdinalMap.put("templates/content/jsp/fragment/deleteRelate/tbody.jet", //$NON-NLS-1$
                Integer.valueOf(98));
        pathToTemplateOrdinalMap.put("templates/content/jsp/fragment/edit/body.jet", //$NON-NLS-1$
                Integer.valueOf(99));
        pathToTemplateOrdinalMap.put("templates/content/jsp/fragment/edit/tbody.jet", //$NON-NLS-1$
                Integer.valueOf(100));
        pathToTemplateOrdinalMap.put("templates/content/jsp/fragment/editRelate/body.jet", //$NON-NLS-1$
                Integer.valueOf(101));
        pathToTemplateOrdinalMap.put("templates/content/jsp/fragment/editRelate/tbody.jet", //$NON-NLS-1$
                Integer.valueOf(102));
        pathToTemplateOrdinalMap.put("templates/content/jsp/fragment/fileHead.jet", //$NON-NLS-1$
                Integer.valueOf(103));
        pathToTemplateOrdinalMap.put("templates/content/jsp/fragment/head.jet", //$NON-NLS-1$
                Integer.valueOf(104));
        pathToTemplateOrdinalMap.put("templates/content/jsp/fragment/list/body.jet", //$NON-NLS-1$
                Integer.valueOf(105));
        pathToTemplateOrdinalMap.put("templates/content/jsp/fragment/list/tbody.jet", //$NON-NLS-1$
                Integer.valueOf(106));
        pathToTemplateOrdinalMap.put("templates/content/jsp/fragment/list/thead.jet", //$NON-NLS-1$
                Integer.valueOf(107));
        pathToTemplateOrdinalMap.put("templates/content/jsp/fragment/view/body.jet", //$NON-NLS-1$
                Integer.valueOf(108));
        pathToTemplateOrdinalMap.put("templates/content/jsp/fragment/view/referenceEntities.jet", //$NON-NLS-1$
                Integer.valueOf(109));
        pathToTemplateOrdinalMap.put("templates/content/jsp/fragment/view/table.jet", //$NON-NLS-1$
                Integer.valueOf(110));
        pathToTemplateOrdinalMap.put("templates/content/jsp/fragment/view/thead.jet", //$NON-NLS-1$
                Integer.valueOf(111));
        pathToTemplateOrdinalMap.put("templates/content/jsp/fragment/viewRelate/body.jet", //$NON-NLS-1$
                Integer.valueOf(112));
        pathToTemplateOrdinalMap.put("templates/content/jsp/fragment/viewRelate/tbody.jet", //$NON-NLS-1$
                Integer.valueOf(113));
        pathToTemplateOrdinalMap.put("templates/content/jsp/index.jet", //$NON-NLS-1$
                Integer.valueOf(114));
        pathToTemplateOrdinalMap.put("templates/content/jsp/list.jet", //$NON-NLS-1$
                Integer.valueOf(115));
        pathToTemplateOrdinalMap.put("templates/content/jsp/menu.jet", //$NON-NLS-1$
                Integer.valueOf(116));
        pathToTemplateOrdinalMap.put("templates/content/jsp/menu/menu.jet", //$NON-NLS-1$
                Integer.valueOf(117));
        pathToTemplateOrdinalMap.put("templates/content/jsp/sitemesh/fileGenerate/fileGenerate.jet", //$NON-NLS-1$
                Integer.valueOf(118));
        pathToTemplateOrdinalMap.put("templates/content/jsp/view.jet", //$NON-NLS-1$
                Integer.valueOf(119));
        pathToTemplateOrdinalMap.put("templates/content/jsp/viewRelate.jet", //$NON-NLS-1$
                Integer.valueOf(120));
        pathToTemplateOrdinalMap.put("templates/process/configure.jet", //$NON-NLS-1$
                Integer.valueOf(121));
        pathToTemplateOrdinalMap.put("templates/process/css.jet", //$NON-NLS-1$
                Integer.valueOf(122));
        pathToTemplateOrdinalMap.put("templates/process/image.jet", //$NON-NLS-1$
                Integer.valueOf(123));
        pathToTemplateOrdinalMap.put("templates/process/initBinder.jet", //$NON-NLS-1$
                Integer.valueOf(124));
        pathToTemplateOrdinalMap.put("templates/process/jar.jet", //$NON-NLS-1$
                Integer.valueOf(125));
        pathToTemplateOrdinalMap.put("templates/process/java.jet", //$NON-NLS-1$
                Integer.valueOf(126));
        pathToTemplateOrdinalMap.put("templates/process/jaxws.jet", //$NON-NLS-1$
                Integer.valueOf(127));
        pathToTemplateOrdinalMap.put("templates/process/jsp.jet", //$NON-NLS-1$
                Integer.valueOf(128));
        pathToTemplateOrdinalMap.put("templates/process/main.jet", //$NON-NLS-1$
                Integer.valueOf(129));
        pathToTemplateOrdinalMap.put("templates/process/mainBackup.jet", //$NON-NLS-1$
                Integer.valueOf(130));
        pathToTemplateOrdinalMap.put("templates/process/meta-inf.jet", //$NON-NLS-1$
                Integer.valueOf(131));
        pathToTemplateOrdinalMap.put("templates/process/project.jet", //$NON-NLS-1$
                Integer.valueOf(132));
        pathToTemplateOrdinalMap.put("templates/process/properties.jet", //$NON-NLS-1$
                Integer.valueOf(133));
        pathToTemplateOrdinalMap.put("templates/process/resources.jet", //$NON-NLS-1$
                Integer.valueOf(134));
        pathToTemplateOrdinalMap.put("templates/process/settings.jet", //$NON-NLS-1$
                Integer.valueOf(135));
        pathToTemplateOrdinalMap.put("templates/process/web-inf.jet", //$NON-NLS-1$
                Integer.valueOf(136));
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jet.JET2TemplateLoader#getTemplate(java.lang.String)
     */
    public JET2Template getTemplate(final String templatePath) {
        final Integer ordinal = pathToTemplateOrdinalMap.get(templatePath);
        if(ordinal != null) {
           switch (ordinal.intValue()) {
            case 0: // templates/content/configure/MANIFEST.MF.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_MANIFESTMF();
            case 1: // templates/content/configure/appengine-web.xml.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_appenginewebxml();
            case 2: // templates/content/configure/application-bundles.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_applicationbundles();
            case 3: // templates/content/configure/applicationContext.xml.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_applicationContextxml();
            case 4: // templates/content/configure/classpath.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_classpath();
            case 5: // templates/content/configure/com.genuitec.runtime.libraries.xml.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_comgenuitecruntimelibrariesxml();
            case 6: // templates/content/configure/dao-context.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_daocontext();
            case 7: // templates/content/configure/dao-property.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_daoproperty();
            case 8: // templates/content/configure/decorators.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_decorators();
            case 9: // templates/content/configure/entity-bundles.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_entitybundles();
            case 10: // templates/content/configure/hibemateProperties.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_hibemateProperties();
            case 11: // templates/content/configure/jaxws-web-context.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_jaxwswebcontext();
            case 12: // templates/content/configure/jtaProperties.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_jtaProperties();
            case 13: // templates/content/configure/log4jProperties.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_log4jProperties();
            case 14: // templates/content/configure/merge.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_merge();
            case 15: // templates/content/configure/org.eclipse.jdt.core.prefs.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_orgeclipsejdtcoreprefs();
            case 16: // templates/content/configure/org.eclipse.wst.common.component.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_orgeclipsewstcommoncomponent();
            case 17: // templates/content/configure/org.eclipse.wst.common.project.facet.core.prefs.xml.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_orgeclipsewstcommonprojectfacetcoreprefsxml();
            case 18: // templates/content/configure/org.eclipse.wst.common.project.facet.core.xml.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_orgeclipsewstcommonprojectfacetcorexml();
            case 19: // templates/content/configure/persistence.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_persistence();
            case 20: // templates/content/configure/project.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_project();
            case 21: // templates/content/configure/security-context.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_securitycontext();
            case 22: // templates/content/configure/service-context.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_servicecontext();
            case 23: // templates/content/configure/spring-form.tld.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_springformtld();
            case 24: // templates/content/configure/spring.tld.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_springtld();
            case 25: // templates/content/configure/springBeans.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_springBeans();
            case 26: // templates/content/configure/web-context.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_webcontext();
            case 27: // templates/content/configure/webxml.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_webxml();
            case 28: // templates/content/java/AbstractJpaDao.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_AbstractJpaDao();
            case 29: // templates/content/java/EntityEditor.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_EntityEditor();
            case 30: // templates/content/java/JpaDao.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_JpaDao();
            case 31: // templates/content/java/controller.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_controller();
            case 32: // templates/content/java/dao.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_dao();
            case 33: // templates/content/java/daoImpl.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_daoImpl();
            case 34: // templates/content/java/domain.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_domain();
            case 35: // templates/content/java/initBinder/CmiController.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_CmiController();
            case 36: // templates/content/java/initBinder/propertiesEditor.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_propertiesEditor();
            case 37: // templates/content/java/initBinder/propertyEditor.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_propertyEditor();
            case 38: // templates/content/java/method/controller/confirmDeleteEntity.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_confirmDeleteEntity();
            case 39: // templates/content/java/method/controller/deleteEntity.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_deleteEntity_1();
            case 40: // templates/content/java/method/controller/editEntity.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_editEntity();
            case 41: // templates/content/java/method/controller/indexEntity.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_indexEntity();
            case 42: // templates/content/java/method/controller/listEntity.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_listEntity();
            case 43: // templates/content/java/method/controller/newEntity.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_newEntity();
            case 44: // templates/content/java/method/controller/saveEntity.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_saveEntity();
            case 45: // templates/content/java/method/controller/selectEntity.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_selectEntity();
            case 46: // templates/content/java/method/controller/streamBinary.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_streamBinary();
            case 47: // templates/content/java/method/controller/variable.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_variable_1();
            case 48: // templates/content/java/method/dao/findAllEntity.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_findAllEntity_2();
            case 49: // templates/content/java/method/dao/findEntityByAttributeColumns.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_findEntityByAttributeColumns_0();
            case 50: // templates/content/java/method/dao/findEntityByPrimaryKey.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_findEntityByPrimaryKey_0();
            case 51: // templates/content/java/method/dao/findEntityByPrimaryKeyColumns.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_findEntityByPrimaryKeyColumns();
            case 52: // templates/content/java/method/daoImpl/canBeMerged.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_canBeMerged();
            case 53: // templates/content/java/method/daoImpl/constructedFunction.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_constructedFunction();
            case 54: // templates/content/java/method/daoImpl/entityManager.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_entityManager();
            case 55: // templates/content/java/method/daoImpl/findAllEntity.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_findAllEntity();
            case 56: // templates/content/java/method/daoImpl/findEntityByAttributeColumns.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_findEntityByAttributeColumns();
            case 57: // templates/content/java/method/daoImpl/findEntityByPrimaryKey.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_findEntityByPrimaryKey_1();
            case 58: // templates/content/java/method/daoImpl/findEntityByPrimaryKeyColumns.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_findEntityByPrimaryKeyColumns_0();
            case 59: // templates/content/java/method/daoImpl/genericity.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_genericity();
            case 60: // templates/content/java/method/daoImpl/variable.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_variable_2();
            case 61: // templates/content/java/method/daomain/copy.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_copy();
            case 62: // templates/content/java/method/daomain/equals.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_equals();
            case 63: // templates/content/java/method/daomain/getAndSet.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_getAndSet();
            case 64: // templates/content/java/method/daomain/hashCode.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_hashCode();
            case 65: // templates/content/java/method/daomain/namedQuery.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_namedQuery();
            case 66: // templates/content/java/method/daomain/toString.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_toString();
            case 67: // templates/content/java/method/daomain/variable.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_variable();
            case 68: // templates/content/java/method/rscontroller/delete.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_delete_0();
            case 69: // templates/content/java/method/rscontroller/get.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_get();
            case 70: // templates/content/java/method/rscontroller/list.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_list_0();
            case 71: // templates/content/java/method/rscontroller/load.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_load();
            case 72: // templates/content/java/method/rscontroller/new.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_new();
            case 73: // templates/content/java/method/rscontroller/save.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_save();
            case 74: // templates/content/java/method/rscontroller/variable.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_variable_3();
            case 75: // templates/content/java/method/service/countEntity.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_countEntity_0();
            case 76: // templates/content/java/method/service/deleteEntity.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_deleteEntity();
            case 77: // templates/content/java/method/service/findAllEntity.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_findAllEntity_1();
            case 78: // templates/content/java/method/service/findEntityByPrimaryKey.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_findEntityByPrimaryKey_2();
            case 79: // templates/content/java/method/service/loadEntity.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_loadEntity_0();
            case 80: // templates/content/java/method/service/saveEntity.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_saveEntity_1();
            case 81: // templates/content/java/method/serviceImpl/countEntity.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_countEntity();
            case 82: // templates/content/java/method/serviceImpl/deleteEntity.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_deleteEntity_0();
            case 83: // templates/content/java/method/serviceImpl/findAllEntity.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_findAllEntity_0();
            case 84: // templates/content/java/method/serviceImpl/findEntityByPrimaryKey.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_findEntityByPrimaryKey();
            case 85: // templates/content/java/method/serviceImpl/loadEntity.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_loadEntity();
            case 86: // templates/content/java/method/serviceImpl/saveEntity.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_saveEntity_0();
            case 87: // templates/content/java/method/serviceImpl/variable.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_variable_0();
            case 88: // templates/content/java/rscontroller.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_rscontroller();
            case 89: // templates/content/java/service.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_service();
            case 90: // templates/content/java/serviceImpl.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_serviceImpl();
            case 91: // templates/content/jsp/delete.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_delete();
            case 92: // templates/content/jsp/deleteRelate.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_deleteRelate();
            case 93: // templates/content/jsp/edit.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_edit();
            case 94: // templates/content/jsp/editRelate.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_editRelate();
            case 95: // templates/content/jsp/fragment/delete/body.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_body_3();
            case 96: // templates/content/jsp/fragment/delete/tbody.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_tbody();
            case 97: // templates/content/jsp/fragment/deleteRelate/body.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_body_4();
            case 98: // templates/content/jsp/fragment/deleteRelate/tbody.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_tbody_2();
            case 99: // templates/content/jsp/fragment/edit/body.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_body_1();
            case 100: // templates/content/jsp/fragment/edit/tbody.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_tbody_3();
            case 101: // templates/content/jsp/fragment/editRelate/body.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_body_2();
            case 102: // templates/content/jsp/fragment/editRelate/tbody.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_tbody_1();
            case 103: // templates/content/jsp/fragment/fileHead.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_fileHead();
            case 104: // templates/content/jsp/fragment/head.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_head();
            case 105: // templates/content/jsp/fragment/list/body.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_body();
            case 106: // templates/content/jsp/fragment/list/tbody.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_tbody_4();
            case 107: // templates/content/jsp/fragment/list/thead.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_thead();
            case 108: // templates/content/jsp/fragment/view/body.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_body_5();
            case 109: // templates/content/jsp/fragment/view/referenceEntities.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_referenceEntities();
            case 110: // templates/content/jsp/fragment/view/table.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_table();
            case 111: // templates/content/jsp/fragment/view/thead.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_thead_0();
            case 112: // templates/content/jsp/fragment/viewRelate/body.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_body_0();
            case 113: // templates/content/jsp/fragment/viewRelate/tbody.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_tbody_0();
            case 114: // templates/content/jsp/index.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_index();
            case 115: // templates/content/jsp/list.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_list();
            case 116: // templates/content/jsp/menu.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_menu();
            case 117: // templates/content/jsp/menu/menu.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_menu_0();
            case 118: // templates/content/jsp/sitemesh/fileGenerate/fileGenerate.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_fileGenerate();
            case 119: // templates/content/jsp/view.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_view();
            case 120: // templates/content/jsp/viewRelate.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_viewRelate();
            case 121: // templates/process/configure.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_configure();
            case 122: // templates/process/css.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_css();
            case 123: // templates/process/image.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_image();
            case 124: // templates/process/initBinder.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_initBinder();
            case 125: // templates/process/jar.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_jar();
            case 126: // templates/process/java.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_java();
            case 127: // templates/process/jaxws.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_jaxws();
            case 128: // templates/process/jsp.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_jsp();
            case 129: // templates/process/main.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_main();
            case 130: // templates/process/mainBackup.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_mainBackup();
            case 131: // templates/process/meta-inf.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_metainf();
            case 132: // templates/process/project.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_project_0();
            case 133: // templates/process/properties.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_properties();
            case 134: // templates/process/resources.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_resources();
            case 135: // templates/process/settings.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_settings();
            case 136: // templates/process/web-inf.jet
                return new cn.edu.scau.cmi.jet.compiled._jet_webinf();
            default:
                break;
            }
        }
        return this.delegate != null ? this.delegate.getTemplate(templatePath) : null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jet.JET2TemplateLoaderExtension#getDelegateLoader()
     */
    public JET2TemplateLoader getDelegateLoader() {
        return this.delegate;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.jet.JET2TemplateLoaderExtension#setDelegateLoader(org.eclipse
     * .jet.JET2TemplateLoader)
     */
    public void setDelegateLoader(final JET2TemplateLoader loader) {
        this.delegate = loader;
    }
}
