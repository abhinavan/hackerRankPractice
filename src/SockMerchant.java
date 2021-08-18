import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SockMerchant
{

    public static  int findPairOfSocks(int n , List<Integer> ar)
    {
        if(ar.size()!=n)
        {
            return -1;
        }
        Map<Integer , Integer> sockMap=new HashMap<>();
        for(Integer i:ar)
        {
            int count=0;
            for(int j=0;j<ar.size();j++)
            {
                if(ar.get(j)==i)
                {
                    count++;
                }
            }
            sockMap.put(i,count);
        }
        System.out.println("Map of color "+sockMap);

        return numberOfPairs(sockMap);
    }
    public static int numberOfPairs(Map<Integer , Integer> sockMap)
    {
        int numberOfPairs=0;
        for(Map.Entry<Integer,Integer> colors:sockMap.entrySet())
        {
            numberOfPairs+= colors.getValue()/2;
        }
        return numberOfPairs;
    }
    public static void main(String[] args)
    {
        System.out.println(findPairOfSocks(9, Arrays.asList(10,20,20,10,10,30,50,10,20)));

    }

}
