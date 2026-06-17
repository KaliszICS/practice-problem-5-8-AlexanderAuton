/**
	* File: Lesson 5.8 - hashMaps
	* Author: Auton
	* Date Created: May 07, 2026
	* Date Last Modified: Jun 16, 2026
*/	
import java.util.HashMap;

public class PracticeProblem {

    public static void main(String args[]) {

    }

    public static HashMap<String, Integer> combineParallelArrays(String[] names, int[] ages) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < names.length; i++) {
            map.put(names[i], ages[i]);
        }

        return map;
    }

    public static void increaseAge(HashMap<String, Integer> map, String name) {
        map.put(name, map.get(name) + 1);
    }

    public static void replaceName(HashMap<String, Integer> map, String oldName, String newName) {
        int age = map.get(oldName);
        map.remove(oldName);
        map.put(newName, age);
    }
}
