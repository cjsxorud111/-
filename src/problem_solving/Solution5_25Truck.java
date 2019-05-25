package problem_solving;

import java.util.LinkedList;

class Solution5_25Truck {
	public int solution(int bridge_length, int weight, int[] truck_weights) {
        LinkedList<Integer> truck = new LinkedList<Integer>();
        LinkedList<Integer> bridge = new LinkedList<Integer>();
        int time = 0;
        int onBridgeWeight = 0;
        for (int i = 0; i < truck_weights.length; i++) {
			truck.add(truck_weights[i]);
		}
        while(true) {
        	time++;
        	if(time > bridge_length) {
        		onBridgeWeight -= bridge.get(0);
        		bridge.remove(0);
        	}
        	if(truck.size() > 0) {
	        	int truckOnBridge = truck.get(0);
	        	if (onBridgeWeight + truckOnBridge <= weight) {
	        		
	            	truck.remove(0);
	        		bridge.add(truckOnBridge);
	        		onBridgeWeight += truckOnBridge;
				} else {
					bridge.add(0);
				}
        	}
        	System.out.println(time+" "+bridge.toString());
        	if(bridge.size() == 0) {
        		break;
        	}
        }
        return time;
    }
    
    public static void main(String[] args) {
    	int [] t = {10};
		
		Solution5_25Truck s = new Solution5_25Truck();
		System.out.println(s.solution(100, 100, t));
	}
}