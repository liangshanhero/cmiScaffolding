package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_daocontext implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$
    private static final String _jetns_f = "org.eclipse.jet.formatTags"; //$NON-NLS-1$

    public _jet_daocontext() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_f_replaceAll_1_1 = new TagInfo("f:replaceAll", //$NON-NLS-1$
            1, 1,
            new String[] {
                "value", //$NON-NLS-1$
                "replacement", //$NON-NLS-1$
            },
            new String[] {
                "Dollar_symbol", //$NON-NLS-1$
                "$", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_28_40 = new TagInfo("c:get", //$NON-NLS-1$
            28, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$packageName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_29_40 = new TagInfo("c:get", //$NON-NLS-1$
            29, 40,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$packageName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_41_23 = new TagInfo("c:get", //$NON-NLS-1$
            41, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$projectName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_68_14 = new TagInfo("c:get", //$NON-NLS-1$
            68, 14,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$project/model/dataBaseType/@schema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_70_57 = new TagInfo("c:get", //$NON-NLS-1$
            70, 57,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$project/model/dataBaseType/@schema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_71_50 = new TagInfo("c:get", //$NON-NLS-1$
            71, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$project/model/dataBaseType/@schema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_72_50 = new TagInfo("c:get", //$NON-NLS-1$
            72, 50,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$project/model/dataBaseType/@schema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_73_45 = new TagInfo("c:get", //$NON-NLS-1$
            73, 45,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$project/model/dataBaseType/@schema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_74_49 = new TagInfo("c:get", //$NON-NLS-1$
            74, 49,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$project/model/dataBaseType/@schema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_75_51 = new TagInfo("c:get", //$NON-NLS-1$
            75, 51,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$project/model/dataBaseType/@schema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_83_12 = new TagInfo("c:get", //$NON-NLS-1$
            83, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$project/model/dataBaseType/@schema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_85_49 = new TagInfo("c:get", //$NON-NLS-1$
            85, 49,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$project/model/dataBaseType/@schema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_86_53 = new TagInfo("c:get", //$NON-NLS-1$
            86, 53,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$project/model/dataBaseType/@schema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_87_58 = new TagInfo("c:get", //$NON-NLS-1$
            87, 58,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$project/model/dataBaseType/@schema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_91_12 = new TagInfo("c:get", //$NON-NLS-1$
            91, 12,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$project/model/dataBaseType/@schema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_93_36 = new TagInfo("c:get", //$NON-NLS-1$
            93, 36,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$project/model/dataBaseType/@schema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_94_47 = new TagInfo("c:get", //$NON-NLS-1$
            94, 47,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$project/model/dataBaseType/@schema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_95_42 = new TagInfo("c:get", //$NON-NLS-1$
            95, 42,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$project/model/dataBaseType/@schema", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_f_replaceAll_1_1 = context.getTagFactory().createRuntimeTag(_jetns_f, "replaceAll", "f:replaceAll", _td_f_replaceAll_1_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_f_replaceAll_1_1.setRuntimeParent(null);
        _jettag_f_replaceAll_1_1.setTagInfo(_td_f_replaceAll_1_1);
        _jettag_f_replaceAll_1_1.doStart(context, out);
        JET2Writer _jettag_f_replaceAll_1_1_saved_out = out;
        while (_jettag_f_replaceAll_1_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("<beans xmlns=\"http://www.springframework.org/schema/beans\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\txmlns:aop=\"http://www.springframework.org/schema/aop\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\txmlns:context=\"http://www.springframework.org/schema/context\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\txmlns:jee=\"http://www.springframework.org/schema/jee\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\txmlns:lang=\"http://www.springframework.org/schema/lang\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\txmlns:security=\"http://www.springframework.org/schema/security\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\txmlns:tx=\"http://www.springframework.org/schema/tx\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\txmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\txsi:schemaLocation=\"http://www.springframework.org/schema/beans      ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\thttp://www.springframework.org/schema/beans/spring-beans-3.1.xsd        ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\thttp://www.springframework.org/schema/aop         ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\thttp://www.springframework.org/schema/aop/spring-aop-3.1.xsd     ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\thttp://www.springframework.org/schema/tx      ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\thttp://www.springframework.org/schema/tx/spring-tx-3.1.xsd        ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\thttp://www.springframework.org/schema/context      ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\thttp://www.springframework.org/schema/context/spring-context-3.1.xsd        ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\thttp://www.springframework.org/schema/jee      ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\thttp://www.springframework.org/schema/jee/spring-jee-3.1.xsd         ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\thttp://www.springframework.org/schema/lang     ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\thttp://www.springframework.org/schema/lang/spring-lang-3.1.xsd     ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\thttp://www.springframework.org/schema/security      ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\thttp://www.springframework.org/schema/security/spring-security-3.1.xsd\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("\t<!-- ******************************************************************** -->");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<!-- Scan for dao layer annotated beans -->");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<!-- ******************************************************************** -->");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<context:component-scan base-package=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_28_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_28_40); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_28_40.setRuntimeParent(_jettag_f_replaceAll_1_1);
            _jettag_c_get_28_40.setTagInfo(_td_c_get_28_40);
            _jettag_c_get_28_40.doStart(context, out);
            _jettag_c_get_28_40.doEnd();
            out.write(".dao\" scoped-proxy=\"interfaces\" />");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<context:component-scan base-package=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_29_40 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_29_40); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_29_40.setRuntimeParent(_jettag_f_replaceAll_1_1);
            _jettag_c_get_29_40.setTagInfo(_td_c_get_29_40);
            _jettag_c_get_29_40.doStart(context, out);
            _jettag_c_get_29_40.doEnd();
            out.write(".initBinder\" scoped-proxy=\"interfaces\" />");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("\t<!-- ******************************************************************** -->");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<!-- Mark bean transactions as annotation driven -->");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<!-- ******************************************************************** -->");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<tx:annotation-driven transaction-manager=\"transactionManager\" />");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("\t<!-- ******************************************************************** -->");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<!-- PropertyConfigurer for the DAO -->");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<!-- ******************************************************************** -->");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<context:property-placeholder");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\tignore-unresolvable=\"true\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\tlocation=\"classpath:");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_41_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_41_23); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_41_23.setRuntimeParent(_jettag_f_replaceAll_1_1);
            _jettag_c_get_41_23.setTagInfo(_td_c_get_41_23);
            _jettag_c_get_41_23.doStart(context, out);
            _jettag_c_get_41_23.doEnd();
            out.write("-dao.properties\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<!-- ******************************************************************** -->");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<!-- Setup the transaction manager -->");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<!-- ******************************************************************** -->");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<!-- Using Atomikos Transaction Manager -->");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<bean id=\"atomikosTransactionManager\" class=\"com.atomikos.icatch.jta.UserTransactionManager\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\tinit-method=\"init\" destroy-method=\"close\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<property name=\"forceShutdown\" value=\"true\" />");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<property name=\"startupTransactionService\" value=\"true\" />");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<property name=\"transactionTimeout\" value=\"60\" />");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t</bean>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("\t<bean id=\"atomikosUserTransaction\" class=\"com.atomikos.icatch.jta.UserTransactionImp\" />");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("\t<!-- Configure the Spring framework to use JTA transactions from Atomikos -->");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<bean id=\"transactionManager\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\tclass=\"org.springframework.transaction.jta.JtaTransactionManager\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<property name=\"transactionManager\" ref=\"atomikosTransactionManager\" />");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<property name=\"userTransaction\" ref=\"atomikosUserTransaction\" />");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<property name=\"transactionSynchronizationName\" value=\"SYNCHRONIZATION_ON_ACTUAL_TRANSACTION\" />");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t</bean>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("\t<!-- ******************************************************************** -->");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<!-- Setup a data source -->");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<!-- ******************************************************************** -->");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("\t<!-- Using Apache DBCP Data Sources -->");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<bean name=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_68_14 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_68_14); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_68_14.setRuntimeParent(_jettag_f_replaceAll_1_1);
            _jettag_c_get_68_14.setTagInfo(_td_c_get_68_14);
            _jettag_c_get_68_14.doStart(context, out);
            _jettag_c_get_68_14.doEnd();
            out.write("DS\" class=\"org.apache.commons.dbcp.BasicDataSource\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\tdestroy-method=\"close\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<property name=\"driverClassName\" value=\"Dollar_symbol{");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_70_57 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_70_57); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_70_57.setRuntimeParent(_jettag_f_replaceAll_1_1);
            _jettag_c_get_70_57.setTagInfo(_td_c_get_70_57);
            _jettag_c_get_70_57.doStart(context, out);
            _jettag_c_get_70_57.doEnd();
            out.write(".connection.driver_class}\" />");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<property name=\"username\" value=\"Dollar_symbol{");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_71_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_71_50); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_71_50.setRuntimeParent(_jettag_f_replaceAll_1_1);
            _jettag_c_get_71_50.setTagInfo(_td_c_get_71_50);
            _jettag_c_get_71_50.doStart(context, out);
            _jettag_c_get_71_50.doEnd();
            out.write(".connection.username}\" />");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<property name=\"password\" value=\"Dollar_symbol{");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_72_50 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_72_50); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_72_50.setRuntimeParent(_jettag_f_replaceAll_1_1);
            _jettag_c_get_72_50.setTagInfo(_td_c_get_72_50);
            _jettag_c_get_72_50.doStart(context, out);
            _jettag_c_get_72_50.doEnd();
            out.write(".connection.password}\" />");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<property name=\"url\" value=\"Dollar_symbol{");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_73_45 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_73_45); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_73_45.setRuntimeParent(_jettag_f_replaceAll_1_1);
            _jettag_c_get_73_45.setTagInfo(_td_c_get_73_45);
            _jettag_c_get_73_45.doStart(context, out);
            _jettag_c_get_73_45.doEnd();
            out.write(".connection.url}\" />");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<property name=\"maxIdle\" value=\"Dollar_symbol{");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_74_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_74_49); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_74_49.setRuntimeParent(_jettag_f_replaceAll_1_1);
            _jettag_c_get_74_49.setTagInfo(_td_c_get_74_49);
            _jettag_c_get_74_49.doStart(context, out);
            _jettag_c_get_74_49.doEnd();
            out.write(".minPoolSize}\" />");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<property name=\"maxActive\" value=\"Dollar_symbol{");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_75_51 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_75_51); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_75_51.setRuntimeParent(_jettag_f_replaceAll_1_1);
            _jettag_c_get_75_51.setTagInfo(_td_c_get_75_51);
            _jettag_c_get_75_51.doStart(context, out);
            _jettag_c_get_75_51.doEnd();
            out.write(".maxPoolSize}\" />");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t</bean>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("\t<!-- ******************************************************************** -->");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<!-- Setup each persistence unit -->");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<!-- ******************************************************************** -->");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("\t<!-- Configure a JPA vendor adapter -->");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<bean id=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_83_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_83_12); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_83_12.setRuntimeParent(_jettag_f_replaceAll_1_1);
            _jettag_c_get_83_12.setTagInfo(_td_c_get_83_12);
            _jettag_c_get_83_12.doStart(context, out);
            _jettag_c_get_83_12.doEnd();
            out.write("JPAVendorAdapter\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\tclass=\"org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<property name=\"showSql\" value=\"Dollar_symbol{");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_85_49 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_85_49); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_85_49.setRuntimeParent(_jettag_f_replaceAll_1_1);
            _jettag_c_get_85_49.setTagInfo(_td_c_get_85_49);
            _jettag_c_get_85_49.doStart(context, out);
            _jettag_c_get_85_49.doEnd();
            out.write(".show_sql}\" />");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<property name=\"generateDdl\" value=\"Dollar_symbol{");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_86_53 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_86_53); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_86_53.setRuntimeParent(_jettag_f_replaceAll_1_1);
            _jettag_c_get_86_53.setTagInfo(_td_c_get_86_53);
            _jettag_c_get_86_53.doStart(context, out);
            _jettag_c_get_86_53.doEnd();
            out.write(".generateDdl}\" />");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<property name=\"databasePlatform\" value=\"Dollar_symbol{");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_87_58 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_87_58); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_87_58.setRuntimeParent(_jettag_f_replaceAll_1_1);
            _jettag_c_get_87_58.setTagInfo(_td_c_get_87_58);
            _jettag_c_get_87_58.doStart(context, out);
            _jettag_c_get_87_58.doEnd();
            out.write(".dialect}\" />");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t</bean>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<!-- EntityManager Factory that brings together the persistence unit, datasource, ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\tand JPA Vendor -->");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t<bean id=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_91_12 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_91_12); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_91_12.setRuntimeParent(_jettag_f_replaceAll_1_1);
            _jettag_c_get_91_12.setTagInfo(_td_c_get_91_12);
            _jettag_c_get_91_12.doStart(context, out);
            _jettag_c_get_91_12.doEnd();
            out.write("\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\tclass=\"org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<property name=\"dataSource\" ref=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_93_36 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_93_36); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_93_36.setRuntimeParent(_jettag_f_replaceAll_1_1);
            _jettag_c_get_93_36.setTagInfo(_td_c_get_93_36);
            _jettag_c_get_93_36.doStart(context, out);
            _jettag_c_get_93_36.doEnd();
            out.write("DS\" />");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<property name=\"persistenceUnitName\" value=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_94_47 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_94_47); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_94_47.setRuntimeParent(_jettag_f_replaceAll_1_1);
            _jettag_c_get_94_47.setTagInfo(_td_c_get_94_47);
            _jettag_c_get_94_47.doStart(context, out);
            _jettag_c_get_94_47.doEnd();
            out.write("\" />");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<property name=\"jpaVendorAdapter\" ref=\"");  //$NON-NLS-1$        
            RuntimeTagElement _jettag_c_get_95_42 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_95_42); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_get_95_42.setRuntimeParent(_jettag_f_replaceAll_1_1);
            _jettag_c_get_95_42.setTagInfo(_td_c_get_95_42);
            _jettag_c_get_95_42.doStart(context, out);
            _jettag_c_get_95_42.doEnd();
            out.write("JPAVendorAdapter\" />");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t<property name=\"jpaPropertyMap\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t<map>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t<entry key=\"hibernate.transaction.manager_lookup_class\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t\tvalue=\"com.atomikos.icatch.jta.hibernate3.TransactionManagerLookup\" />");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t\t<entry key=\"hibernate.connection.release_mode\" value=\"on_close\" />");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t\t</map>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t\t</property>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("\t</bean>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("</beans>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_f_replaceAll_1_1.handleBodyContent(out);
        }
        out = _jettag_f_replaceAll_1_1_saved_out;
        _jettag_f_replaceAll_1_1.doEnd();
    }
}
