package programmers.level1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class P92334 {

  public int[] solution(String[] id_list, String[] report, int k) {
    int[] answer = new int[id_list.length];
    Map<String, Integer> idxMap = new HashMap<>();
    List<User> userList = new ArrayList<>();
    List<String> lockList = new ArrayList<>();

    for (int i = 0; i < id_list.length; i++) {
      idxMap.put(id_list[i], i);
      userList.add(new User(id_list[i]));
    }

    for (String s: report) {
      String activeId = s.split(" ")[0];
      String reportedId = s.split(" ")[1];

      userList.get(idxMap.get(reportedId)).reportedSet.add(activeId);
    }

    for (User user: userList) {
      if (user.reportedSet.size() >= k) {
        lockList.add(user.name);
      }
    }

    for (User user: userList) {
      if (lockList.contains(user.name)) {
        for (String id : user.reportedSet){
          answer[idxMap.get(id)]++;
        }
      }
    }
    return answer;
  }

  static class User {
     String name;
     Set<String> reportedSet;

     User(String name) {
      this.name = name;
      reportedSet = new HashSet<>();
    }
  }


//  public int[] solution(String[] id_list, String[] report, int k) {
//    int[] answer = new int[id_list.length];
//    Map<String, HashSet<String>> map = new HashMap<>();
//    Map<String, Integer> reportMap = new HashMap<>();
//    List<String> lockList = new ArrayList<>();
//
//    for (String id : id_list) {
//      map.put(id, new HashSet<>());
//    }
//
//    for (String s : report) {
//      String activeId = s.split(" ")[0];
//      String reportedId = s.split(" ")[1];
//
//      if (!map.get(activeId).contains(reportedId)) {
//        map.get(activeId).add(reportedId);
//        reportMap.put(reportedId, reportMap.getOrDefault(reportedId, 0) + 1);
//      }
//
//    }
//
//    for (String key : reportMap.keySet()) {
//      if (reportMap.get(key) >= k) {
//        lockList.add(key);
//      }
//    }
//
//    for (int i = 0; i < id_list.length; i++) {
//      for (String lock : lockList) {
//        if (map.get(id_list[i]).contains(lock)) {
//          answer[i]++;
//        }
//      }
//    }
//    return answer;
//  }

}
