/**
 * This class is generated by jOOQ
 */
package io.github.ibuildthecloud.dstack.core.model.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StoragePoolHostMapTable extends org.jooq.impl.TableImpl<io.github.ibuildthecloud.dstack.core.model.tables.records.StoragePoolHostMapRecord> {

	private static final long serialVersionUID = 1700319378;

	/**
	 * The singleton instance of <code>dstack.storage_pool_host_map</code>
	 */
	public static final io.github.ibuildthecloud.dstack.core.model.tables.StoragePoolHostMapTable STORAGE_POOL_HOST_MAP = new io.github.ibuildthecloud.dstack.core.model.tables.StoragePoolHostMapTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<io.github.ibuildthecloud.dstack.core.model.tables.records.StoragePoolHostMapRecord> getRecordType() {
		return io.github.ibuildthecloud.dstack.core.model.tables.records.StoragePoolHostMapRecord.class;
	}

	/**
	 * The column <code>dstack.storage_pool_host_map.id</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.StoragePoolHostMapRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>dstack.storage_pool_host_map.host_id</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.StoragePoolHostMapRecord, java.lang.Long> HOST_ID = createField("host_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>dstack.storage_pool_host_map.storage_pool_id</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.StoragePoolHostMapRecord, java.lang.Long> STORAGE_POOL_ID = createField("storage_pool_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>dstack.storage_pool_host_map.state</code>. 
	 */
	public final org.jooq.TableField<io.github.ibuildthecloud.dstack.core.model.tables.records.StoragePoolHostMapRecord, java.lang.String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this);

	/**
	 * Create a <code>dstack.storage_pool_host_map</code> table reference
	 */
	public StoragePoolHostMapTable() {
		super("storage_pool_host_map", io.github.ibuildthecloud.dstack.core.model.DstackTable.DSTACK);
	}

	/**
	 * Create an aliased <code>dstack.storage_pool_host_map</code> table reference
	 */
	public StoragePoolHostMapTable(java.lang.String alias) {
		super(alias, io.github.ibuildthecloud.dstack.core.model.DstackTable.DSTACK, io.github.ibuildthecloud.dstack.core.model.tables.StoragePoolHostMapTable.STORAGE_POOL_HOST_MAP);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<io.github.ibuildthecloud.dstack.core.model.tables.records.StoragePoolHostMapRecord, java.lang.Long> getIdentity() {
		return io.github.ibuildthecloud.dstack.core.model.Keys.IDENTITY_STORAGE_POOL_HOST_MAP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<io.github.ibuildthecloud.dstack.core.model.tables.records.StoragePoolHostMapRecord> getPrimaryKey() {
		return io.github.ibuildthecloud.dstack.core.model.Keys.KEY_STORAGE_POOL_HOST_MAP_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<io.github.ibuildthecloud.dstack.core.model.tables.records.StoragePoolHostMapRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<io.github.ibuildthecloud.dstack.core.model.tables.records.StoragePoolHostMapRecord>>asList(io.github.ibuildthecloud.dstack.core.model.Keys.KEY_STORAGE_POOL_HOST_MAP_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<io.github.ibuildthecloud.dstack.core.model.tables.records.StoragePoolHostMapRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<io.github.ibuildthecloud.dstack.core.model.tables.records.StoragePoolHostMapRecord, ?>>asList(io.github.ibuildthecloud.dstack.core.model.Keys.STORAGE_POOL_HOST_MAP_IBFK_1, io.github.ibuildthecloud.dstack.core.model.Keys.STORAGE_POOL_HOST_MAP_IBFK_2);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public io.github.ibuildthecloud.dstack.core.model.tables.StoragePoolHostMapTable as(java.lang.String alias) {
		return new io.github.ibuildthecloud.dstack.core.model.tables.StoragePoolHostMapTable(alias);
	}
}