package cn.edu.scau.cmi.liangzaoqing.initbinder;

import java.beans.PropertyEditorSupport;
import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

import cn.edu.scau.cmi.liangzaoqing.domain.Office;

@Component("OfficeEditor")
public class OfficeEditor extends PropertyEditorSupport{
	public void setAsText(String officeDetails){
		Set<Office> officeSet=new HashSet<Office>();
		
		String[] officeStringSet = officeDetails.split(",");
		
		for(int i=1;i<officeStringSet.length;i++){
			
			Office office=new Office();
			
			String iString = String.valueOf(i);
			if(iString.length()<2){
				iString="0"+iString;
			}
			officeSet.add(office);
		}
		setValue(officeSet);
	}
}
