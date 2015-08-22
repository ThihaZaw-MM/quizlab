package com.xvitcoder.angualrspringapp.service;

import java.util.List;

import com.xvitcoder.angualrspringapp.beans.DesignWork;
import com.xvitcoder.angualrspringapp.beans.Member;
import com.xvitcoder.angualrspringapp.beans.TaskPerformance;

public interface ReportService {
	List<DesignWork> getAllDesignWorks();
	List<Member> getAllMembers();
	void saveTaskPerformances(List<TaskPerformance> taskPerformanceList);
}
