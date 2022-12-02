package programmers.level_1;

import java.util.*;

/**
 * packageName : programmers.level_1
 * fileName : 신고_결과_받기
 * author : gim-yeong-geun
 * date : 2022/11/24
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/11/24         gim-yeong-geun          최초 생성
 */
public class 신고_결과_받기 {
    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;
        System.out.println(Arrays.toString(new 신고_결과_받기().solution(id_list, report, k)));
    }

    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        String[] deleteDupleList = deleteDuple(report);
        String[] reportList = reportList(id_list, deleteDupleList, k);
        List<String[]> reportListById = new ArrayList<>();
        for (String id : id_list) {
            reportListById.add(reportListById(id, deleteDupleList));
        }
        int i = 0;
        for(String[] items : reportListById){
            answer[i] = reportCountById(items, reportList);
            i++;
        }
        return answer;
    }

    // id 별 신고자 리스트
    public String[] reportListById(String id, String[] deleteDupleReport) {
        List<String> reportIdList = new ArrayList<>();
        for (String item : deleteDupleReport) {
            if (item.split(" ")[0].equals(id)) {
                reportIdList.add(item.split(" ")[1]);
            }
        }
        String[] result = new String[reportIdList.size()];
        int i = 0;
        for (String reportId : reportIdList) {
            result[i] = reportId;
            i++;
        }
        return result;
    }

    // report 중복 제거
    public String[] deleteDuple(String[] report) {
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(report));
        String[] resultArr = hashSet.toArray(new String[0]);
        System.out.println(resultArr);
        return resultArr;
    }

    // 제제 대상 결정 기능
    public String[] reportList(String[] id_list, String[] deleteDupleReport, int k) {
        List<String> report_id = new ArrayList<>();
        // deleteDupleReport 신고당한 id List로 변환
        List<String> deleteDupleReportSet = new ArrayList<>();
        for (String report : deleteDupleReport) {
            deleteDupleReportSet.add(report.split(" ")[1]);
        }
        // 신고대상 배열 변환
        for (int i = 0; i < id_list.length; i++) {
            if (Collections.frequency(deleteDupleReportSet,id_list[i]) >= k) {
                report_id.add(id_list[i]);
            }
        }
        String[] result = new String[report_id.size()];
        int i = 0;
        for (String item : report_id) {
            result[i] = item;
            i++;
        }
        return result;
    }

    // id 신고자 리스트 재제대상 수 구하는 기능
    public int reportCountById(String[] reportListById, String[] reportList) {
        int count = 0;
        // list 변환
        List<String> reportListByIdSet = new ArrayList<>();
        for (String report : reportListById) {
            reportListByIdSet.add(report);
        }
        for (String report : reportList) {
            if (reportListByIdSet.contains(report)) {
                count += 1;
            }
        }

        return count;
    }
}
