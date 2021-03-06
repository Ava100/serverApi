/**
 * This class is generated by jOOQ
 */
package com.common.generated.tables.records;


import com.common.generated.tables.AckTaskData;

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
public class AckTaskDataRecord extends UpdatableRecordImpl<AckTaskDataRecord> implements Record11<Long, Byte, Long, Byte, Timestamp, Timestamp, Integer, Timestamp, String, String, String> {

	private static final long serialVersionUID = -2037516568;

	/**
	 * Setter for <code>recruit.ack_task_data.id</code>. 主键
	 */
	public void setId(Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>recruit.ack_task_data.id</code>. 主键
	 */
	public Long getId() {
		return (Long) getValue(0);
	}

	/**
	 * Setter for <code>recruit.ack_task_data.business_type</code>. 业务类型
	 */
	public void setBusinessType(Byte value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>recruit.ack_task_data.business_type</code>. 业务类型
	 */
	public Byte getBusinessType() {
		return (Byte) getValue(1);
	}

	/**
	 * Setter for <code>recruit.ack_task_data.business_id</code>. 业务id
	 */
	public void setBusinessId(Long value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>recruit.ack_task_data.business_id</code>. 业务id
	 */
	public Long getBusinessId() {
		return (Long) getValue(2);
	}

	/**
	 * Setter for <code>recruit.ack_task_data.status</code>. 0:默认(未处理),1:已发送确认消息,2:正常完成,3:异常
	 */
	public void setStatus(Byte value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>recruit.ack_task_data.status</code>. 0:默认(未处理),1:已发送确认消息,2:正常完成,3:异常
	 */
	public Byte getStatus() {
		return (Byte) getValue(3);
	}

	/**
	 * Setter for <code>recruit.ack_task_data.create_time</code>. 创建时间
	 */
	public void setCreateTime(Timestamp value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>recruit.ack_task_data.create_time</code>. 创建时间
	 */
	public Timestamp getCreateTime() {
		return (Timestamp) getValue(4);
	}

	/**
	 * Setter for <code>recruit.ack_task_data.next_send_time</code>. 下个执行时间
	 */
	public void setNextSendTime(Timestamp value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>recruit.ack_task_data.next_send_time</code>. 下个执行时间
	 */
	public Timestamp getNextSendTime() {
		return (Timestamp) getValue(5);
	}

	/**
	 * Setter for <code>recruit.ack_task_data.exe_num</code>. 执行次数
	 */
	public void setExeNum(Integer value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>recruit.ack_task_data.exe_num</code>. 执行次数
	 */
	public Integer getExeNum() {
		return (Integer) getValue(6);
	}

	/**
	 * Setter for <code>recruit.ack_task_data.update_time</code>. 修改时间
	 */
	public void setUpdateTime(Timestamp value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>recruit.ack_task_data.update_time</code>. 修改时间
	 */
	public Timestamp getUpdateTime() {
		return (Timestamp) getValue(7);
	}

	/**
	 * Setter for <code>recruit.ack_task_data.exception_text</code>. 异常信息
	 */
	public void setExceptionText(String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>recruit.ack_task_data.exception_text</code>. 异常信息
	 */
	public String getExceptionText() {
		return (String) getValue(8);
	}

	/**
	 * Setter for <code>recruit.ack_task_data.ip</code>. ip地址
	 */
	public void setIp(String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>recruit.ack_task_data.ip</code>. ip地址
	 */
	public String getIp() {
		return (String) getValue(9);
	}

	/**
	 * Setter for <code>recruit.ack_task_data.url</code>. url请求地址
	 */
	public void setUrl(String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>recruit.ack_task_data.url</code>. url请求地址
	 */
	public String getUrl() {
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
	public Row11<Long, Byte, Long, Byte, Timestamp, Timestamp, Integer, Timestamp, String, String, String> fieldsRow() {
		return (Row11) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row11<Long, Byte, Long, Byte, Timestamp, Timestamp, Integer, Timestamp, String, String, String> valuesRow() {
		return (Row11) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field1() {
		return AckTaskData.ACK_TASK_DATA.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field2() {
		return AckTaskData.ACK_TASK_DATA.BUSINESS_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field3() {
		return AckTaskData.ACK_TASK_DATA.BUSINESS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field4() {
		return AckTaskData.ACK_TASK_DATA.STATUS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field5() {
		return AckTaskData.ACK_TASK_DATA.CREATE_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field6() {
		return AckTaskData.ACK_TASK_DATA.NEXT_SEND_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field7() {
		return AckTaskData.ACK_TASK_DATA.EXE_NUM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field8() {
		return AckTaskData.ACK_TASK_DATA.UPDATE_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field9() {
		return AckTaskData.ACK_TASK_DATA.EXCEPTION_TEXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field10() {
		return AckTaskData.ACK_TASK_DATA.IP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field11() {
		return AckTaskData.ACK_TASK_DATA.URL;
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
	public String value9() {
		return getExceptionText();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value10() {
		return getIp();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value11() {
		return getUrl();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AckTaskDataRecord value1(Long value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AckTaskDataRecord value2(Byte value) {
		setBusinessType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AckTaskDataRecord value3(Long value) {
		setBusinessId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AckTaskDataRecord value4(Byte value) {
		setStatus(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AckTaskDataRecord value5(Timestamp value) {
		setCreateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AckTaskDataRecord value6(Timestamp value) {
		setNextSendTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AckTaskDataRecord value7(Integer value) {
		setExeNum(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AckTaskDataRecord value8(Timestamp value) {
		setUpdateTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AckTaskDataRecord value9(String value) {
		setExceptionText(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AckTaskDataRecord value10(String value) {
		setIp(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AckTaskDataRecord value11(String value) {
		setUrl(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AckTaskDataRecord values(Long value1, Byte value2, Long value3, Byte value4, Timestamp value5, Timestamp value6, Integer value7, Timestamp value8, String value9, String value10, String value11) {
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
	 * Create a detached AckTaskDataRecord
	 */
	public AckTaskDataRecord() {
		super(AckTaskData.ACK_TASK_DATA);
	}

	/**
	 * Create a detached, initialised AckTaskDataRecord
	 */
	public AckTaskDataRecord(Long id, Byte businessType, Long businessId, Byte status, Timestamp createTime, Timestamp nextSendTime, Integer exeNum, Timestamp updateTime, String exceptionText, String ip, String url) {
		super(AckTaskData.ACK_TASK_DATA);

		setValue(0, id);
		setValue(1, businessType);
		setValue(2, businessId);
		setValue(3, status);
		setValue(4, createTime);
		setValue(5, nextSendTime);
		setValue(6, exeNum);
		setValue(7, updateTime);
		setValue(8, exceptionText);
		setValue(9, ip);
		setValue(10, url);
	}
}
