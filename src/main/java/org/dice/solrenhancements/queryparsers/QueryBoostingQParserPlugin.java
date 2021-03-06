package org.dice.solrenhancements.queryparsers;

import org.apache.solr.common.params.SolrParams;
import org.apache.solr.common.util.NamedList;
import org.apache.solr.request.SolrQueryRequest;
import org.apache.solr.search.QParser;
import org.apache.solr.search.QParserPlugin;

/**
 * Created by simon.hughes on 7/31/15.
 */
public class QueryBoostingQParserPlugin extends QParserPlugin {
    public static String NAME = "queryboost";

    @Override
    public void init(NamedList args) {
    }

    @Override
    public QParser createParser(String qstr, SolrParams localParams, SolrParams params, SolrQueryRequest req) {
        return new QueryBoostingQParser(qstr, localParams, params, req);
    }

}
