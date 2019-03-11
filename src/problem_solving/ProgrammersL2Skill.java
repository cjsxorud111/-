package problem_solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ProgrammersL2Skill {
	
	public static int solution(String skill, String[] skill_trees) {
		int answer = 0;

		ArrayList<Character> skillList = new ArrayList<Character>();
		for (int i = 0; i < skill.length(); i++) {
			skillList.add(skill.charAt(i));
		}

		for (int i = 0; i < skill_trees.length; i++) {
			ArrayList<Character> treeList = new ArrayList<Character>();

			for (int j = 0; j < skill_trees[i].length(); j++) {
				if (skillList.contains(skill_trees[i].charAt(j))) {
					treeList.add(skill_trees[i].charAt(j));
				}
			}

			ArrayList<Integer> tempList = new ArrayList<Integer>();
			ArrayList<Integer> tempList2 = new ArrayList<Integer>();

			for (int j = 0; j < treeList.size(); j++) {
				for (int q = 0; q < skillList.size(); q++) {
					if (treeList.get(j) == skillList.get(q)) {
						tempList.add(q);
						
					}
				}
			}

			for (int j = 0; j < treeList.size(); j++) {
				tempList2.add(j);
			}

			if (tempList.size() > 1 && tempList.get(0) == 0) {
				if (tempList.equals(tempList2)) {
					answer++;
				}
			} else if (tempList.get(0) == 0) {
				answer++;
			}
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		String skill = "CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA", "CDA"};
		System.out.println(solution(skill, skill_trees));
	}
}
