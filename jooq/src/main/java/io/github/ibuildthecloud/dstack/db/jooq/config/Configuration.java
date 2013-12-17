package io.github.ibuildthecloud.dstack.db.jooq.config;

import io.github.ibuildthecloud.dstack.archaius.util.ArchaiusUtil;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.sql.DataSource;

import org.jooq.ConnectionProvider;
import org.jooq.SQLDialect;
import org.jooq.conf.RenderNameStyle;
import org.jooq.conf.Settings;
import org.jooq.impl.DefaultConfiguration;

public class Configuration extends DefaultConfiguration {

    private static final long serialVersionUID = -726368732372005280L;

    String name;
    DataSource dataSource;
    ConnectionProvider connectionProvider;

    @PostConstruct
    public void init() {
        String prop = "db." + name + ".database";
        String database = ArchaiusUtil.getStringProperty(prop).get();
        if ( database == null ) {
            throw new IllegalStateException("Failed to find config for [" + prop + "]");
        }

        try {
            SQLDialect dialect = SQLDialect.valueOf(database.trim().toUpperCase());
            set(dialect);
        } catch ( IllegalArgumentException e ) {
            throw new IllegalArgumentException("Invalid SQLDialect [" + database.toUpperCase() + "]", e);
        }

        if ( connectionProvider == null ) {
            set(new AutoCommitConnectionProvider(dataSource));
        } else {
            set(connectionProvider);
        }

        Settings settings = new Settings();
        settings.setRenderSchema(false);

        String renderNameStyle = ArchaiusUtil.getStringProperty("db." + name + "." + database + ".render.name.style").get();
        if ( renderNameStyle != null ) {
            settings.setRenderNameStyle(RenderNameStyle.valueOf(renderNameStyle.trim().toUpperCase()));
        }

        set(settings);
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public String getName() {
        return name;
    }

    @Inject
    public void setName(String name) {
        this.name = name;
    }

    public ConnectionProvider getConnectionProvider() {
        return connectionProvider;
    }

    public void setConnectionProvider(ConnectionProvider connectionProvider) {
        this.connectionProvider = connectionProvider;
    }
}