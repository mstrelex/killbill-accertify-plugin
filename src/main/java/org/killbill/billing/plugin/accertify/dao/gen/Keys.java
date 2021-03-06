/**
 * This class is generated by jOOQ
 */
package org.killbill.billing.plugin.accertify.dao.gen;

/**
 * A class modelling foreign key relationships between tables of the <code>killbill</code> 
 * schema
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.0"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.Identity<org.killbill.billing.plugin.accertify.dao.gen.tables.records.AccertifyResponsesRecord, org.jooq.types.UInteger> IDENTITY_ACCERTIFY_RESPONSES = Identities0.IDENTITY_ACCERTIFY_RESPONSES;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.UniqueKey<org.killbill.billing.plugin.accertify.dao.gen.tables.records.AccertifyResponsesRecord> KEY_ACCERTIFY_RESPONSES_PRIMARY = UniqueKeys0.KEY_ACCERTIFY_RESPONSES_PRIMARY;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends org.jooq.impl.AbstractKeys {
		public static org.jooq.Identity<org.killbill.billing.plugin.accertify.dao.gen.tables.records.AccertifyResponsesRecord, org.jooq.types.UInteger> IDENTITY_ACCERTIFY_RESPONSES = createIdentity(org.killbill.billing.plugin.accertify.dao.gen.tables.AccertifyResponses.ACCERTIFY_RESPONSES, org.killbill.billing.plugin.accertify.dao.gen.tables.AccertifyResponses.ACCERTIFY_RESPONSES.RECORD_ID);
	}

	private static class UniqueKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.UniqueKey<org.killbill.billing.plugin.accertify.dao.gen.tables.records.AccertifyResponsesRecord> KEY_ACCERTIFY_RESPONSES_PRIMARY = createUniqueKey(org.killbill.billing.plugin.accertify.dao.gen.tables.AccertifyResponses.ACCERTIFY_RESPONSES, org.killbill.billing.plugin.accertify.dao.gen.tables.AccertifyResponses.ACCERTIFY_RESPONSES.RECORD_ID);
	}
}
