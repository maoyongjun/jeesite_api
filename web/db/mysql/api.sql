DROP TABLE IF EXISTS `api_log`;
CREATE TABLE `api_log`  (
id		varchar	(100)	COMMENT	'访问记录的id',
api_code		varchar	(100)	COMMENT	'API的编号',
api_name		varchar	(200)	COMMENT	'API的名称',
response_code		varchar	(50)	COMMENT	'请求返回的状态码，例如 200 404 500',
in_date		date				COMMENT	'访问进入的时间',
out_date		date				COMMENT	'访问返回的时间',
take_time		long				COMMENT	'消耗的时长(毫秒)',
is_data_pull_status		int				COMMENT	'数据为主动获取 还是被动接收 0：主动拉取 1：被动接收',
dataType		varchar	(50)	COMMENT	'请求的数据格式，例如xml、JSON',
request_data		varchar	(8000)	COMMENT	'请求的数据',
response_data		varchar	(8000)	COMMENT	'返回的数据'
) ENGINE = InnoDB CHARACTER SET = utf8 
COLLATE = utf8_general_ci COMMENT = 'api访问记录' ROW_FORMAT = Dynamic;


DROP TABLE IF EXISTS `api_log_total`;
CREATE TABLE `api_log_total`  (
id		varchar	(100)	COMMENT	'id',
api_code		varchar	(100)	COMMENT	'API的编号',
api_name		varchar	(200)	COMMENT	'API的名称',
count		long		COMMENT	'访问次数',
status		int				COMMENT	'0：成功 1：失败',
in_date		date				COMMENT	'访问进入的时间,每小时一条记录',
hours		long				COMMENT	'api访问时间毫秒数转化为小时数，按小时统计',
take_avg_time		long				COMMENT	'消耗的平均时长(毫秒)'
) ENGINE = InnoDB CHARACTER SET = utf8 
COLLATE = utf8_general_ci COMMENT = 'api访问次数统计表' ROW_FORMAT = Dynamic;


DROP TABLE IF EXISTS `api_register`;
CREATE TABLE `api_register`  (
id		varchar	(100)	COMMENT	'id',
api_code		varchar	(100)	COMMENT	'API的编号',
api_name		varchar	(200)	COMMENT	'API的名称',
api_url	varchar(500)	COMMENT 'API接口的地址',
api_desc	varchar(500)	COMMENT 'API接口的描述',
cron		varchar(100)	COMMENT	'定时调用的表达式，针对主动定时调用接口使用',
create_by		varchar	(100)	COMMENT	'API创建人',
register_time		date				COMMENT	'API注册的时间',
update_time		date				COMMENT	'API最后修改时间',
api_type	int		COMMENT '0：接口是主动调用 1：接口是被动调用'

) ENGINE = InnoDB CHARACTER SET = utf8 
COLLATE = utf8_general_ci COMMENT = 'api注册记录' ROW_FORMAT = Dynamic;
