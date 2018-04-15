package MathProbGene;


import java.util.Random;
import static org.junit.Assert.*;
import org.junit.Test;

public class WindowsTest {

	static long lCurrenTime = System.currentTimeMillis();
	private static Random Rand = new Random(lCurrenTime);
	
	private static int intRand(int min,int max){
		return min + Rand.nextInt( max - min + 1 ); 
	}
	
	private static int[] arrRand(){
		int[] res = new int[6];
		for(int i=0;i<6;++i)
			res[i] = intRand(1, 100);
		return res;
	}
	
	private static boolean[] brrRand(){
		boolean[] res = new boolean[8];
		for(int i=0;i<8;++i)
			res[i] = Rand.nextBoolean();
		return res;
	}
	
	@Test
	public void testOnce() {
		int[] arr = arrRand();
		boolean[] brr = brrRand();
		assertEquals( true, new Windows().Start(arr,brr));
	}
	@Test
	public void testMore() {
		int[] arr = arrRand();
		boolean[] brr = brrRand();
		for(int i=0;i<128;++i){	
			for(int j=i,k=0;k<8;j/=2,k++) 
				brr[k]=( j % 2 == 0 ? false : true );
			assertEquals( true, new Windows().Start(arr,brr));
		}
	}
	@Test
	public void testNegative0() {
		for(int i=0;i<128;++i){	
			int[] arr = arrRand();
			boolean[] brr = brrRand();
			arr[2] = -arr[2];
			arr[3] = arr[3];
			assertEquals( true, new Windows().Start(arr,brr));
		}
	}
	@Test
	public void testNegative1() {
		for(int i=0;i<128;++i){	
			int[] arr = arrRand();
			boolean[] brr = brrRand();
			arr[2] = -arr[2];
			arr[3] = -arr[3];
			assertEquals( true, new Windows().Start(arr,brr));
		}
	}
	@Test
	public void testNegative2() {
		for(int i=0;i<128;++i){	
			int[] arr = arrRand();
			boolean[] brr = brrRand();
			arr[2] = arr[2];
			arr[3] = -arr[3];
			assertEquals( true, new Windows().Start(arr,brr));
		}
	}
}