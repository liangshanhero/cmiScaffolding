package cn.edu.scau.cmi.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_merge implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_merge() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_replaceStrings_1_1 = new TagInfo("c:replaceStrings", //$NON-NLS-1$
            1, 1,
            new String[] {
                "replace", //$NON-NLS-1$
                "with", //$NON-NLS-1$
            },
            new String[] {
                "%Left_angle_brackets,%Right_angle_brackets", //$NON-NLS-1$
                "<,>", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_c_replaceStrings_1_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "replaceStrings", "c:replaceStrings", _td_c_replaceStrings_1_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_replaceStrings_1_1.setRuntimeParent(null);
        _jettag_c_replaceStrings_1_1.setTagInfo(_td_c_replaceStrings_1_1);
        _jettag_c_replaceStrings_1_1.doStart(context, out);
        JET2Writer _jettag_c_replaceStrings_1_1_saved_out = out;
        while (_jettag_c_replaceStrings_1_1.okToProcessBody()) {
            out = out.newNestedContentWriter();
            out.write(NL);         
            out.write("%Left_angle_brackets?xml version=\"1.0\" encoding=\"UTF-8\"?%Right_angle_brackets");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("<merge:options ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("  indent=\"  \"  ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("  braceStyle=\"matching\"  ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("  redirect=\"Gen\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("  block=\"\\s*@\\s*generated\\s*NOT\\s*(?:\\n\\r?|\\r\\n?)\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("  noImport=\"\\s*//\\s*import\\s+([\\w.*]*)\\s*;\\s*(?:\\n\\r?|\\r\\n?)\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("  xmlns:merge=\"http://www.eclipse.org/org/eclipse/emf/codegen/jmerge/Options\">");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("%Left_angle_brackets!--  dictionary pattern for @generated --%Right_angle_brackets");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(" <merge:dictionaryPattern ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    name=\"generatedUnmodifiableMembers\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    select=\"Member/getComment\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    match=\"@\\s*(gen)erated\\s*(This field/method[^\\n]*)*\\n\"/> ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("%Left_angle_brackets!--  dictionary pattern for @ModelReference--%Right_angle_brackets");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("  <merge:dictionaryPattern ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    name=\"modelReferences\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    select=\"Member/getComment\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    match=\"@\\s*(ModelReference)\\s*\\[\" />");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("   ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("%Left_angle_brackets!--  dictionary pattern for @ModelCoreReference--%Right_angle_brackets");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("  <merge:dictionaryPattern ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    name=\"modelCoreReferences\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    select=\"Member/getComment\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    match=\"@\\s*(ModelCoreReference)\\s*\\[\" />");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("%Left_angle_brackets!--  not sure if we need the match and the dictionary --%Right_angle_brackets");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("  <merge:match ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    markup=\"^ModelReference$\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    get=\"Member/getComment\" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    signature=\"\\s*@\\s*ModelReference\\s*(?:NOT\\s*)*(\\S*)\\s*\\n\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("  %Left_angle_brackets!-- Sweep annotations from all generated content, Skyway JMerger will only clear Annotations added by Skyway --%Right_angle_brackets");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("  %Left_angle_brackets!-- See ManagedAnnotationsExtensionPointReader for the extension point def --%Right_angle_brackets");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("  <merge:sweep parentMarkup=\"^gen$|^ModelReference$|^ModelCoreReference$\"  select=\"Annotation\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("  ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("   %Left_angle_brackets!--  Assume this clears previously generated content --%Right_angle_brackets");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("  <merge:sweep markup=\"^gen$|^ModelReference$|^ModelCoreReference$\" select=\"Member\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("  ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("   %Left_angle_brackets!-- This rule will sweep any stale Skyway imports. --%Right_angle_brackets");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("  <merge:sweep markup=\"^org.skyway.*$|^com.skyway.*$\" select=\"Import\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("  ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("  %Left_angle_brackets!-- This rule will sweep any stale Spring imports. --%Right_angle_brackets");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("  <merge:sweep markup=\"^org.springframework.*$\" select=\"Import\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("  ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(" %Left_angle_brackets!-- Sets the content of annotations if the parent is marked with gen --%Right_angle_brackets ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("  <merge:pull ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      sourceGet=\"Annotation/getContents\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      targetParentMarkup=\"^gen$|^ModelReference$|^ModelCoreReference$\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("      targetPut=\"Annotation/setContents\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("  ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("  %Left_angle_brackets!-- Push Annotations for all generated content --%Right_angle_brackets");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("  <merge:push targetParentMarkup=\"^gen$|^ModelReference$|^ModelCoreReference$\" select=\"Annotation\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("  ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("  %Left_angle_brackets!-- Copy all generated content --%Right_angle_brackets");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("  <merge:pull ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    sourceMarkup=\"^gen$|^ModelReference$|^ModelCoreReference$\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    sourceGet=\"Member/getComment\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    targetMarkup=\"^gen$|^ModelReference$|^ModelCoreReference$\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    targetPut=\"Member/setComment\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("  <merge:pull ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    sourceGet=\"Member/getFlags\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    targetMarkup=\"^gen$|^ModelReference$|^ModelCoreReference$\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    equals=\"Member/getName\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    targetPut=\"Member/setFlags\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("   <merge:pull ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    sourceMarkup=\"^gen$|^ModelReference$|^ModelCoreReference$\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    sourceGet=\"AbstractType/getComment\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    targetMarkup=\"^gen$|^ModelReference$|^ModelCoreReference$\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    targetPut=\"AbstractType/setComment\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("  <merge:pull ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    sourceGet=\"Type/getTypeParameters\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    targetMarkup=\"^gen$|^ModelReference$|^ModelCoreReference$\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    targetPut=\"Type/setTypeParameters\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("  <merge:pull ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    sourceGet=\"Type/getSuperclass\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    targetMarkup=\"^gen$|^ModelReference$|^ModelCoreReference$\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    targetPut=\"Type/setSuperclass\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("  <merge:pull ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    sourceGet=\"Type/getSuperInterfaces\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    sourceTransfer=\"(\\s*@\\s*extends|\\s*@\\s*implements)(.*?)(?:&lt;!--|(?:\\n\\r?|\\r\\n?))\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    targetMarkup=\"^gen$|^ModelReference$|^ModelCoreReference$\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    targetPut=\"Type/addSuperInterface\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("  <merge:pull ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    sourceGet=\"Enum/getSuperInterfaces\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    sourceTransfer=\"(\\s*@\\s*extends|\\s*@\\s*implements)(.*?)(?:&lt;!--|(?:\\n\\r?|\\r\\n?))\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    targetMarkup=\"^gen$|^ModelReference$|^ModelCoreReference$\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    targetPut=\"Enum/addSuperInterface\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("  <merge:pull ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    sourceGet=\"EnumConstant/getArguments\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    targetMarkup=\"^gen$|^ModelReference$|^ModelCoreReference$\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    targetPut=\"EnumConstant/setArguments\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("  <merge:pull ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    sourceGet=\"EnumConstant/getBody\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    targetMarkup=\"^gen$|^ModelReference$|^ModelCoreReference$\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    targetPut=\"EnumConstant/setBody\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("  <merge:pull ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    sourceGet=\"Member/getFlags\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    targetPut=\"Member/setFlags\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("  <merge:pull ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    sourceGet=\"Initializer/getBody\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    targetMarkup=\"^gen$|^ModelReference$|^ModelCoreReference$\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    targetPut=\"Initializer/setBody\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("  <merge:pull ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    sourceGet=\"Field/getType\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    targetMarkup=\"^gen$|^ModelReference$|^ModelCoreReference$\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    targetPut=\"Field/setType\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("  <merge:pull ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    sourceGet=\"Field/getInitializer\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    targetMarkup=\"^gen$|^ModelReference$|^ModelCoreReference$\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    targetPut=\"Field/setInitializer\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(NL);         
            out.write("  <merge:pull ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    sourceGet=\"Method/getTypeParameters\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    targetMarkup=\"^gen$|^ModelReference$|^ModelCoreReference$\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    targetPut=\"Method/setTypeParameters\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("  <merge:pull ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    sourceGet=\"Method/getReturnType\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    targetMarkup=\"^gen$|^ModelReference$|^ModelCoreReference$\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    targetPut=\"Method/setReturnType\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("  <merge:pull ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    sourceGet=\"Method/getParameters\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    targetMarkup=\"^gen$|^ModelReference$|^ModelCoreReference$\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    targetPut=\"Method/setParameters\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("   <merge:pull ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    sourceGet=\"Method/getBody\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    targetMarkup=\"gen$|^ModelReference$|^ModelCoreReference$\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    targetPut=\"Method/setBody\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("  <merge:pull ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    sourceGet=\"Method/getExceptions\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    targetMarkup=\"^gen$|^ModelReference$|^ModelCoreReference$\"");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("    targetPut=\"Method/setExceptions\"/>");  //$NON-NLS-1$        
            out.write(NL);         
            out.write(" ");  //$NON-NLS-1$        
            out.write(NL);         
            out.write("</merge:options>");  //$NON-NLS-1$        
            out.write(NL);         
            _jettag_c_replaceStrings_1_1.handleBodyContent(out);
        }
        out = _jettag_c_replaceStrings_1_1_saved_out;
        _jettag_c_replaceStrings_1_1.doEnd();
        out.write(NL);         
    }
}
