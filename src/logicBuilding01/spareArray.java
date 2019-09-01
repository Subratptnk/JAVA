/*
 * 
 */
package logicBuilding01;
import java.util.*;
public class spareArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	       
        int stringSize = in.nextInt();
        
        ArrayList <String> strList = new ArrayList<String>();
        for(int i = 0 ; i< stringSize ; ++i)
            strList.add(in.next());
        
        int querySize = in.nextInt();
        ArrayList <String> queryList = new ArrayList<String>();
        for(int i = 0 ; i< querySize ; ++i)
            queryList.add(in.next());
        
        
        for(int i = 0 ; i <querySize ; ++i)
        {
            int count=0;
            for(int j=0 ; j<stringSize ; ++j)
                {
                    if(queryList.get(i).equalsIgnoreCase(strList.get(j))) //logic
                        count++;
                }
            
            System.out.println(count);
        }

	}

}
