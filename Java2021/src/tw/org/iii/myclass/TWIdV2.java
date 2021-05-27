package tw.org.iii.myclass;

public class TWIdV2 {
	public static boolean checkID(String id) {
		String letter="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String letter2="12";
		String letter3="0123456789";
		boolean isOK=true;
		if(id.length()==10) {			// 1. 檢查字串超過10或沒超過10
			char c1 = id.charAt(0) ;
			int pos=letter.lastIndexOf(c1);
			if(pos !=-1) {				// 2. 第一碼不是英文
				char c2=id.charAt(1);
				int pos2=letter2.lastIndexOf(c2);
				if(pos2!=-1) {       	// 3. 第二碼的數字不是1或2
					for(int i=2;i<10;i++) {
						char c3=id.charAt(i);
						int pos3 = letter3.lastIndexOf(c3);
						if(pos3 == -1) {
							isOK=false;
							break;
						}	
					}
					if(isOK == true) {  // 4. 3~10有英文數字
							
						}else {
							return false;
						}
					
				}else {
					return false;
				}
				
			}else {
				return false;
			}
			
			
		}else {
			return false;
		}
		
		return isOK;
		
	}
}