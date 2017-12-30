package cn.edu.scau.cmi.liangzaoqing.initbinder;

import java.beans.PropertyEditorSupport;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.edu.scau.cmi.liangzaoqing.domain.Teacher;

//封装Teacher的teachers属性

@Component("TeacherEditor")
public class TeacherEditor extends PropertyEditorSupport{
	/*需要spring注入*/
//	@Autowired
//	private SxEdkzDAO sxEdkzDAO;
//	@Autowired
//	private SxEdkzDetailDAO sxEdkzDetailDAO;
//	@Autowired
//	private ZwXmedkzDAO zwXmedkzDAO;
//	@Autowired
//	private ZwxmedzdDAO zwxmedzdDAO;
	
//	将页面传入的offices属性（String类型）封装成office集合
	public void setAsText(String sxEdkzDetails){
//		项目额度明细集合，开始为空，最后将页面的输入依次添加进入，
//		SxEdkz sxEdkz=new SxEdkz();
		Set<Teacher> teacherSet=new HashSet<Teacher>();
//		将页面中传来的值分拆，每一部分在封装为一个额度控制明细对象，再将这个额度控制明细对象添加到集合中
		String[] teacherStringSet = sxEdkzDetails.split(",");
		
		for(int i=1;i<teacherStringSet.length;i++){
			
			String teacherString = teacherStringSet[i];//输入的各项明细的值
			Teacher teacher=new Teacher();
//			sxEdkzDetail.setSxEdkz(sxEdkz);
			
//			项目编码i,如果个位数，需要在前面添加0
			String iString = String.valueOf(i);
			if(iString.length()<2){
				iString="0"+iString;
			}
			teacherSet.add(teacher);
		}
		setValue(teacherSet);
	}
}
