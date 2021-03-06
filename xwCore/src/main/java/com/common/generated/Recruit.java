/**
 * This class is generated by jOOQ
 */
package com.common.generated;


import com.common.generated.tables.AckTaskData;
import com.common.generated.tables.AckTaskDataBak;
import com.common.generated.tables.Book;
import com.common.generated.tables.DistributedTaskData;
import com.common.generated.tables.DistributedTaskDataBak;
import com.common.generated.tables.SchemaVersion;
import com.common.generated.tables.TaskConfig;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Recruit extends SchemaImpl {

	private static final long serialVersionUID = -532191106;

	/**
	 * The reference instance of <code>recruit</code>
	 */
	public static final Recruit RECRUIT = new Recruit();

	/**
	 * No further instances allowed
	 */
	private Recruit() {
		super("recruit");
	}

	@Override
	public final List<Table<?>> getTables() {
		List result = new ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final List<Table<?>> getTables0() {
		return Arrays.<Table<?>>asList(
			AckTaskData.ACK_TASK_DATA,
			AckTaskDataBak.ACK_TASK_DATA_BAK,
			Book.BOOK,
			DistributedTaskData.DISTRIBUTED_TASK_DATA,
			DistributedTaskDataBak.DISTRIBUTED_TASK_DATA_BAK,
			SchemaVersion.SCHEMA_VERSION,
			TaskConfig.TASK_CONFIG);
	}
}
