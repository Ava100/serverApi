/**
 * This class is generated by jOOQ
 */
package com.common.generated.tables.records;


import com.common.generated.tables.DistributedTaskData;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


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
public class DistributedTaskDataRecord extends UpdatableRecordImpl<DistributedTaskDataRecord> implements Record11<Long, Byte, Long, Byte, Timestamp, Timestamp, Integer, Timestamp, Timestamp, String, String> {

	private static final long serialVersionUID = -823086745;

	/**
	 * Setter for <code>recruit.distributed_task_data.id</code>. 主键
	 */
	public void setId(Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>recruit.distributed_task_data.id</code>. 主键
	 */
	public Long getId() {
		return (Long) getValue(0);
	}

	/**
	 * Setter for <code>recruit.distributed_task_data.business_type</code>. 业务类型
	 */
	public void setBusinessType(Byte value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>recruit.distributed_task_data.business_type</code>. 业务类型
	 */
	public Byte getBusinessType() {
		return (Byte) getValue(1);
	}

	/**
	 * Setter for <code>recruit.distributed_task_data.business_id</code>. 业务id
	 */
	public void setBusinessId(Long value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>recruit.distributed_task_data.business_id</code>. 业务id
	 */
	public Long getBusinessId() {
		return (Long) getValue(2);
	}

	/**
	 * Setter for <code>recruit.distributed_task_data.status</code>. 0:默认(未处理),1:已被获取,2:正常完成,3:异常
	 */
	public void setStatus(Byte value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>recruit.distributed_task_data.status</code>. 0:默认(未处理),1:已被获取,2:正常完成,3:异常
	 */
	public Byte getStatus() {
		return (Byte) getValue(3);
	}

	/**
	 * Setter for <code>recruit.distributed_task_data.create_time</code>. 创建时间
	 */
	public void setCreateTime(Timestamp value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>recruit.distributed_task_data.create_time</code>. 创建时间
	 */
	public Timestamp getCreateTime() {
		return (Timestamp) getValue(4);
	}

	/**
	 * Setter for <code>recruit.distributed_task_data.next_send_time</code>. 下个执行时间
	 */
	public void setNextSendTime(Timestamp value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>recruit.distributed_task_data.next_send_time</code>. 下个执行时间
	 */
	public Timestamp getNextSendTime() {
		return (Timestamp) getValue(5);
	}

	/**
	 * Setter for <code>recruit.distributed_task_data.exe_num</code>. 执行次数
	 */
	public void setExeNum(Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>recruit.distributed_task_data.exe_num</code>. 执行次数
	 */
	public Integer getExeNum() {
		return (Integer) getValue(6);
	}

	/**
	 * Setter for <code>recruit.distributed_task_data.update_time</code>. 修改时间
	 */
	public void setUpdateTime(Timestamp value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>recruit.distributed_task_data.update_time</code>. 修改时间
	 */
	public Timestamp getUpdateTime() {
		return (Timestamp) getValue(7);
	}

	/**
	 * Setter for <code>recruit.distributed_task_data.ack_time</code>. ack时间
	 */
	public void setAckTime(Timestamp value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>recruit.distributed_task_data.ack_time</code>. ack时间
	 */
	public Timestamp getAckTime() {
		return (Timestamp) getValue(8);
	}

	/**
	 * Setter for <code>recruit.distributed_task_data.exception_text</code>. 异常信息
	 */
	public void setExceptionText(String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>recruit.distributed_task_data.exception_text</code>. 异常信息
	 */
	public String getExceptionText() {
		return (String) getValue(9);
	}

	/**
	 * Setter for <code>recruit.distributed_task_data.ip</code>. ip地址
	 */
	public void setIp(String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>recruit.distributed_task_data.ip</code>. ip地址
	 */
	public String getIp() {
		return (String) getValue(10);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Long> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record11 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row11<Long, Byte, Long, Byte, Timestamp, Timestamp, Integer, Timestamp, Timestamp, String, String> fieldsRow() {
		return (Row11) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row11<Long, Byte, Long, Byte, Timestamp, Timestamp, Integer, Timestamp, Timestamp, String, String> valuesRow() {
		return (Row11) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field1() {
		return DistributedTaskData.DISTRIBUTED_TASK_DATA.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field2() {
		return DistributedTaskData.DISTRIBUTED_TASK_DATA.BUSINESS_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field3() {
		return DistributedTaskData.DISTRIBUTED_TASK_DATA.BUSINESS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field4() {
		return DistributedTaskData.DISTRIBUTED_TASK_DATA.STATUS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field5() {
		return DistributedTaskData.DISTRIBUTED_TASK_DATA.CREATE_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field6() {
		return DistributedTaskData.DISTRIBUTED_TASK_DATA.NEXT_SEND_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field7() {
		return DistributedTaskData.DISTRIBUTED_TASK_DATA.EXE_NUM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field8() {
		return DistributedTaskData.DISTRIBUTED_TASK_DATA.UPDATE_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field9() {
		return DistributedTaskData.DISTRIBUTED_TASK_DATA.ACK_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field10() {
		return DistributedTaskData.DISTRIBUTED_TASK_DATA.EXCEPTION_TEXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field11() {
		return DistributedTaskData.DISTRIBUTED_TASK_DATA.IP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Byte value2() {
		return getBusinessType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value3() {
		return getBusinessId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Byte value4() {
		return getStatus();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value5() {
		return getCreateTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value6() {
		return getNextSendTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value7() {
		return getExeNum();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value8() {
		return getUpdateTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value9() {
		return getAckTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value10() {
		return getExceptionText();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value11() {
		return getIp();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DistributedTaskDataRecord value1(Long value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DistributedTaskDataRecord value2(Byte value) {
		setBusinessType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DistributedTaskDataRecord value3(Long value) {
		setBusinessId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DistributedTaskDataRecord value4(Byte value) {
		setStatus(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DistributedTaskDataRecord value5(Timestamp value) {
		setCreateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DistributedTaskDataRecord value6(Timestamp value) {
		setNextSendTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DistributedTaskDataRecord value7(Integer value) {
		setExeNum(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DistributedTaskDataRecord value8(Timestamp value) {
		setUpdateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DistributedTaskDataRecord value9(Timestamp value) {
		setAckTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DistributedTaskDataRecord value10(String value) {
		setExceptionText(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DistributedTaskDataRecord value11(String value) {
		setIp(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DistributedTaskDataRecord values(Long value1, Byte value2, Long value3, Byte value4, Timestamp value5, Timestamp value6, Integer value7, Timestamp value8, Timestamp value9, String value10, String value11) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		value9(value9);
		value10(value10);
		value11(value11);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached DistributedTaskDataRecord
	 */
	public DistributedTaskDataRecord() {
		super(DistributedTaskData.DISTRIBUTED_TASK_DATA);
	}

	/**
	 * Create a detached, initialised DistributedTaskDataRecord
	 */
	public DistributedTaskDataRecord(Long id, Byte businessType, Long businessId, Byte status, Timestamp createTime, Timestamp nextSendTime, Integer exeNum, Timestamp updateTime, Timestamp ackTime, String exceptionText, String ip) {
		super(DistributedTaskData.DISTRIBUTED_TASK_DATA);

		setValue(0, id);
		setValue(1, businessType);
		setValue(2, businessId);
		setValue(3, status);
		setValue(4, createTime);
		setValue(5, nextSendTime);
		setValue(6, exeNum);
		setValue(7, updateTime);
		setValue(8, ackTime);
		setValue(9, exceptionText);
		setValue(10, ip);
	}
}