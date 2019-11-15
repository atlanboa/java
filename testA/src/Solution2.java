import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Solution2 {

	static class Atom{
		int y;
		int x;
		int dir;
		int energy;
		
		public Atom(int y, int x, int dir, int energy) {
			super();
			this.y = y;
			this.x = x;
			this.dir = dir;
			this.energy = energy;
		}

		@Override
		public String toString() {
			return "Atom [y=" + y + ", x=" + x + ", dir=" + dir + ", energy=" + energy + "]";
		}
		
		
	}
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		for(int t=1; t<=T; t++) {
			ArrayList<Atom> list = new ArrayList<>();
			int n = Integer.parseInt(br.readLine());
			for(int i=0; i<n; i++) {
				String str = br.readLine();
				int y = Integer.parseInt(str.split(" ")[0]);
				int x = Integer.parseInt(str.split(" ")[1]);
				int dir = Integer.parseInt(str.split(" ")[2]);
				int energy = Integer.parseInt(str.split(" ")[3]);
				list.add(new Atom(y, x, dir, energy));
			}
			
			
			bw.write("#" + t + " "+"\n");
		}//for t
		bw.flush();
		bw.close();
		
	 
	}

}
