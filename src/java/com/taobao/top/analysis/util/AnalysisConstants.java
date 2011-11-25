package com.taobao.top.analysis.util;

/**
 * 报表常量定义
 * 
 * @author fangweng
 * 
 */
public class AnalysisConstants {

	public final static String IGNORE_PROCESS = "ignore";// 用于系统内部过滤不符合条件的key
	public final static String GLOBAL_KEY = "GLOBAL_KEY";// 定义在报表中的全局key，作为对所有记录作全局统计用，也就是没有key做统计
	public final static String RECORD_LENGTH = "RECORD_LENGTH";// 定义在报表过滤条件中，用于过滤切割后记录数是否符合条件

	// condition的条件设置
	public final static String CONDITION_EQUAL = "=";
	public final static String CONDITION_NOT_EQUAL = "!=";
	public final static String CONDITION_GREATER = ">";
	public final static String CONDITION_LESSER = "<";
	public final static String CONDITION_EQUALORGREATER = ">=";
	public final static String CONDITION_EQUALORLESSER = "<=";
	public final static String CONDITION_ISNUMBER = "isnumber";// 是否是数字
	public final static String CONDITION_ROUND = "round:";// 是否需要保留几位小数

	//报表中的特殊字符
	public final static String PREF_SUM = "_:s";
	public final static String PREF_COUNT = "_:c";
	
	public final static String SPLIT_KEY = "--";

	public final static String RETURN = "\r\n";
	
	public final static String REPLACE_PREFIX = ":i";
	
	
	//用于导出数据的私有分隔符
	public final static String EXPORT_RECORD_SPLIT = "<->";
	public final static String EXPORT_COLUMN_SPLIT = "(!)";
	public final static String EXPORT_DOUBLE_SPLIT = "d(!)";
	
	
	//导出文件的后缀名
	public final static String COMMON_DATAFILE_SUFFIX = ".adata";
	public final static String INNER_DATAFILE_SUFFIX = ".idata";
	public final static String CBCK_DATAFILE_SUFFIX = ".bck";
	public final static String IBCK_DATAFILE_SUFFIX = ".ibck";
	

	// 分布式交互命令定义

	public final static long COMMAND_HEARTBEAT = 0x00000001;
	public final static long COMMAND_GETJOB = 0x10000000;
	public final static long COMMAND_SEND_ANALYSIS_RESULT = 0x10000001;
	public final static long COMMAND_GETRULE = 0x10000002;

	public final static String CHART_FILENAME = "topanalysis.html";
	public final static String DATA_RESULT = "topresult.data";
	public final static String DATA_JOBSTATUSPOOL = "topjobstatus.data";
	public final static String DATA_JOBS = "topjobs.data";
	public final static String TIMESTAMP_FILE = "analysis.timestamp";

	public final static String JOBFILEFROM_FTP = "ftp";
	public final static String JOBFILEFROM_MACHINE = "machine";

}