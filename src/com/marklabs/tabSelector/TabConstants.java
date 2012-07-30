package com.marklabs.tabSelector;

public enum TabConstants {

	HOME("HOME"),
	HOME_DASHBOARD("HOME_DASHBOARD"),
	HOME_BASIC_DESCRIPTION("HOME_BASIC_DESCRIPTION"),
	FINANCES("FINANCES"),
	FINANCES_TEAM_HOME("FINANCES_TEAM_HOME"),
	FINANCES_MANAGE_FINANCES("FINANCES_MANAGE_FINANCES"),
	MARKETING("MARKETING"),
	MARKETING_TEAM_HOME("MARKETING_TEAM_HOME"),
	MARKETING_BRAND_MANAGEMENT("MARKETING_BRAND_MANAGEMENT"),
	MARKETING_PRODUCTION_AND_PRICING("MARKETING_PRODUCTION_AND_PRICING"),
	MARKETING_ADVERTISEMENT("MARKETING_ADVERTISEMENT"),
	OPERATIONS("OPERATIONS"),
	OPERATIONS_TEAM_HOME("OPERATIONS_TEAM_HOME"),
	OPERATIONS_MANAGE_OPERATIONS("OPERATIONS_MANAGE_OPERATIONS"),
	HUMAN_RESOURCES("HUMAN_RESOURCES"),
	HUMAN_RESOURCES_TEAM_HOME("HUMAN_RESOURCES_TEAM_HOME"),
	HUMAN_RESOURCES_MANAGE_HR("HUMAN_RESOURCES_MANAGE_HR"),
	SALES("SALES"),
	SALES_TEAM_HOME("SALES_TEAM_HOME"),
	SALES_FORCE_MANAGEMENT("SALES_FORCE_MANAGEMENT"),
	INTELLIGENCE("INTELLIGENCE"),
	INTELLIGENCE_TEAM_HOME("INTELLIGENCE_TEAM_HOME"),
	INTELLIGENCE_MARKET_RESEARCH("INTELLIGENCE_MARKET_RESEARCH"),
	BOARD_ROOM("BOARD_ROOM"),
	BOARD_ROOM_HOME("BOARD_ROOM_HOME"),
	BOARD_ROOM_MARKET_NEWS("BOARD_ROOM_MARKET_NEWS"),
	RND("RND"),
	RND_HOME("RND_HOME"),
	RND_VIEW_RND_REPORT("RND_VIEW_RND_REPORT"),
	RND_ADD_RESEARCH_PROJECT("RND_ADD_RESEARCH_PROJECT"),
	RND_VIEW_EDIT_RESEARCH_PROJECT("RND_VIEW_EDIT_RESEARCH_PROJECT"),
	TQM("TQM");
	
	
	private String databaseName;
	
	private TabConstants(String dbName) {
		this.databaseName = dbName;
	}

	public String getDatabaseName() {
		return databaseName;
	}

}