package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_AbstractJpaDao implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_AbstractJpaDao() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_1_9 = new TagInfo("c:get", //$NON-NLS-1$
            1, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$packageName", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("package ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_1_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_1_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_1_9.setRuntimeParent(null);
        _jettag_c_get_1_9.setTagInfo(_td_c_get_1_9);
        _jettag_c_get_1_9.doStart(context, out);
        _jettag_c_get_1_9.doEnd();
        out.write(".dao;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("import java.util.Collection;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import java.util.Iterator;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import java.util.List;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import java.util.Set;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("import javax.persistence.EntityManager;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import javax.persistence.EntityNotFoundException;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("import javax.persistence.Query;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("import org.springframework.transaction.annotation.Transactional;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("public abstract class AbstractJpaDao<T extends Object> implements JpaDao<T> {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tprivate int defaultMaxResults = DEFAULT_MAX_RESULTS;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tpublic abstract EntityManager getEntityManager();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic abstract Set<Class<?>> getTypes();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t@Transactional");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic T store(T toStore) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif (canBeMerged(toStore)) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn merge(toStore);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\telse {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\treturn persist(toStore);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t@Transactional");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic T merge(T toMerge) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn getEntityManager().merge(toMerge);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t@Transactional");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic T persist(T toPersist) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tgetEntityManager().persist(toPersist);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn toPersist;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t@Transactional");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic void remove(Object toRemove) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\ttoRemove = getEntityManager().merge(toRemove);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tgetEntityManager().remove(toRemove);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t@Transactional");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic void flush() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tgetEntityManager().flush();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t@SuppressWarnings(\"unchecked\")");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t@Transactional");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic void refresh(Object o) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\ttry {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tif (o != null) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tif (o instanceof java.util.Collection) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tfor (Iterator<?> i = ((Collection<?>) o).iterator(); i.hasNext();) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\ttry {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\trefresh(i.next());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t} catch (EntityNotFoundException x) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\t// This entity has been deleted - remove it from the collection");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t\ti.remove();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t} else {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\tif (getTypes().contains(o.getClass())) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t\tgetEntityManager().refresh(o);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t} catch (EntityNotFoundException x) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t// This entity has been deleted");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t@Transactional");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic void setDefaultMaxResults(int defaultMaxResults) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tthis.defaultMaxResults = defaultMaxResults;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t@Transactional");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic int getDefaultMaxResults() {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn defaultMaxResults;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t@Transactional");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t@SuppressWarnings(\"unchecked\")");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic T executeQueryByNameSingleResult(String queryName) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn (T) executeQueryByNameSingleResult(queryName, (Object[])null);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t@Transactional");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t@SuppressWarnings(\"unchecked\")");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic T executeQueryByNameSingleResult(String queryName, Object... parameters) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tQuery query = createNamedQuery(queryName, DEFAULT_FIRST_RESULT_INDEX, 1, parameters);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn (T) query.getSingleResult();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t@Transactional");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic List<T> executeQueryByName(String queryName) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn executeQueryByName(queryName, DEFAULT_FIRST_RESULT_INDEX, getDefaultMaxResults());");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t@Transactional");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic List<T> executeQueryByName(String queryName, Integer firstResult, Integer maxResults)  {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn executeQueryByName(queryName, firstResult, maxResults, (Object[])null);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t@Transactional");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic List<T> executeQueryByName(String queryName, Object... parameters)  {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn executeQueryByName(queryName, DEFAULT_FIRST_RESULT_INDEX, getDefaultMaxResults(), parameters);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t@Transactional");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t@SuppressWarnings(\"unchecked\")");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic List<T> executeQueryByName(String queryName, Integer firstResult, Integer maxResults, Object... parameters)  {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tQuery query = createNamedQuery(queryName, firstResult, maxResults, parameters);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn query.getResultList();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t@Transactional");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic Query createNamedQuery(String queryName, Integer firstResult, Integer maxResults)  {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn createNamedQuery(queryName, firstResult, maxResults, (Object[])null);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t@Transactional");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic Query createNamedQuery(String queryName, Integer firstResult, Integer maxResults, Object... parameters)  {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tQuery query = getEntityManager().createNamedQuery(queryName);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif (parameters != null) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tfor (int i = 0; i < parameters.length; i++) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tquery.setParameter(i + 1, parameters[i]);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tquery.setFirstResult(firstResult == null || firstResult < 0 ? DEFAULT_FIRST_RESULT_INDEX : firstResult);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif (maxResults != null && maxResults > 0)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tquery.setMaxResults(maxResults);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\treturn query;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t@Transactional");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t@SuppressWarnings(\"unchecked\")");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic List<T> executeQuery(String queryString, Integer firstResult, Integer maxResults, Object... parameters)  {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tQuery query = createQuery(queryString, firstResult, maxResults, parameters);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn query.getResultList();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t@Transactional");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t@SuppressWarnings(\"unchecked\")");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic List<T> executeQuery(String queryString, Object... parameters)  {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tQuery query = createQuery(queryString, DEFAULT_FIRST_RESULT_INDEX, getDefaultMaxResults(), parameters);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn query.getResultList();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t@Transactional");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t@SuppressWarnings(\"unchecked\")");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic Object executeQuerySingleResult(String queryString) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn  executeQuerySingleResult(queryString, (Object[])null);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t@Transactional");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t@SuppressWarnings(\"unchecked\")");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic T executeQuerySingleResult(String queryString, Object... parameters) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tQuery query = createQuerySingleResult(queryString, parameters);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn (T) query.getSingleResult();");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t@Transactional");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic Query createQuery (String queryString, Integer firstResult, Integer maxResults){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn createQuery(queryString, firstResult, maxResults, (Object[])null);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic Query createQuerySingleResult (String queryString, Object... parameters) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\treturn createQuery(queryString, DEFAULT_FIRST_RESULT_INDEX, 1, parameters);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t@Transactional");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic Query createQuery (String queryString, Integer firstResult, Integer maxResults, Object... parameters){");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tQuery query = getEntityManager().createQuery(queryString);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif (parameters != null) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tfor (int i = 0; i < parameters.length; i++) {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t\tquery.setParameter(i + 1, parameters[i]);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tquery.setFirstResult(firstResult == null || firstResult < 0 ? DEFAULT_FIRST_RESULT_INDEX : firstResult);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tif (maxResults != null && maxResults > 0)");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tquery.setMaxResults(maxResults);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\treturn query;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tpublic abstract boolean canBeMerged (T o);");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
