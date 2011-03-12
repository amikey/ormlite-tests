package com.j256.ormlite.db;

import com.j256.ormlite.db.SqliteDatabaseTypeTest;

/**
 * Does tests on a real database connection. I didn't want to have to require someone to have have downloaded derby
 * database to have the ormlite tests work.
 */
public class SqliteConnectTypeTest extends SqliteDatabaseTypeTest {

	@Override
	protected void setDatabaseParams() {
		databaseUrl = "jdbc:sqlite:";
	}

	@Override
	protected boolean isDriverClassExpected() {
		return true;
	}
}