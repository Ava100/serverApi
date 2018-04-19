/**
 * This class is generated by jOOQ
 */
package com.common.generated.tables;


import com.common.generated.Keys;
import com.common.generated.Recruit;
import com.common.generated.tables.records.DistributedTaskDataRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DistributedTaskData extends TableImpl<DistributedTaskDataRecord> {

	private static final long serialVersionUID = 1522683534;

	/**
	 * The reference instance of <code>recruit.distributed_task_data</code>
	 */
	public static final DistributedTaskData DISTRIBUTED_TASK_DATA = new DistributedTaskData();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<DistributedTaskDataRecord> getRecordType() {
		return DistributedTaskDataRecord.class;
	}

	/**
	 * The column <code>recruit.distributed_task_data.id</code>. 主键
	 */
	public final TableField<DistributedTaskDataRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "主键");

	/**
	 * The column <code>recruit.distributed_task_data.business_type</code>. 业务类型
	 */
	public final TableField<DistributedTaskDataRecord, Byte> BUSINESS_TYPE = createField("business_type", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaulted(true), this, "业务类型");

	/**
	 * The column <code>recruit.distributed_task_data.business_id</code>. 业务id
	 */
	public final TableField<DistributedTaskDataRecord, Long> BUSINESS_ID = createField("business_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "业务id");

	/**
	 * The column <code>recruit.distributed_task_data.status</code>. 0:默认(未处理),1:已被获取,2:正常完成,3:异常
	 */
	public final TableField<DistributedTaskDataRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaulted(true), this, "0:默认(未处理),1:已被获取,2:正常完成,3:异常");

	/**
	 * The column <code>recruit.distributed_task_data.create_time</code>. 创建时间
	 */
	public final TableField<DistributedTaskDataRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "创建时间");

	/**
	 * The column <code>recruit.distributed_task_data.next_send_time</code>. 下个执行时间
	 */
	public final TableField<DistributedTaskDataRecord, Timestamp> NEXT_SEND_TIME = createField("next_send_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "下个执行时间");

	/**
	 * The column <code>recruit.distributed_task_data.exe_num</code>. 执行次数
	 */
	public final TableField<DistributedTaskDataRecord, Integer> EXE_NUM = createField("exe_num", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "执行次数");

	/**
	 * The column <code>recruit.distributed_task_data.update_time</code>. 修改时间
	 */
	public final TableField<DistributedTaskDataRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "修改时间");

	/**
	 * The column <code>recruit.distributed_task_data.ack_time</code>. ack时间
	 */
	public final TableField<DistributedTaskDataRecord, Timestamp> ACK_TIME = createField("ack_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "ack时间");

	/**
	 * The column <code>recruit.distributed_task_data.exception_text</code>. 异常信息
	 */
	public final TableField<DistributedTaskDataRecord, String> EXCEPTION_TEXT = createField("exception_text", org.jooq.impl.SQLDataType.CLOB, this, "异常信息");

	/**
	 * The column <code>recruit.distributed_task_data.ip</code>. ip地址
	 */
	public final TableField<DistributedTaskDataRecord, String> IP = createField("ip", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false).defaulted(true), this, "ip地址");

	/**
	 * Create a <code>recruit.distributed_task_data</code> table reference
	 */
	public DistributedTaskData() {
		this("distributed_task_data", null);
	}

	/**
	 * Create an aliased <code>recruit.distributed_task_data</code> table reference
	 */
	public DistributedTaskData(String alias) {
		this(alias, DISTRIBUTED_TASK_DATA);
	}

	private DistributedTaskData(String alias, Table<DistributedTaskDataRecord> aliased) {
		this(alias, aliased, null);
	}

	private DistributedTaskData(String alias, Table<DistributedTaskDataRecord> aliased, Field<?>[] parameters) {
		super(alias, Recruit.RECRUIT, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<DistributedTaskDataRecord, Long> getIdentity() {
		return Keys.IDENTITY_DISTRIBUTED_TASK_DATA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<DistributedTaskDataRecord> getPrimaryKey() {
		return Keys.KEY_DISTRIBUTED_TASK_DATA_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<DistributedTaskDataRecord>> getKeys() {
		return Arrays.<UniqueKey<DistributedTaskDataRecord>>asList(Keys.KEY_DISTRIBUTED_TASK_DATA_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DistributedTaskData as(String alias) {
		return new DistributedTaskData(alias, this);
	}

	/**
	 * Rename this table
	 */
	public DistributedTaskData rename(String name) {
		return new DistributedTaskData(name, null);
	}
}