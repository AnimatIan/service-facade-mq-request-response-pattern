package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_Logesql_0 implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_Logesql_0() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_if_5_1 = new TagInfo("c:if", //$NON-NLS-1$
            5, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "boolean($root/brokerSchema)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_7_1 = new TagInfo("c:if", //$NON-NLS-1$
            7, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "string-length($root/brokerSchema) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_15 = new TagInfo("c:get", //$NON-NLS-1$
            9, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/brokerSchema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_18 = new TagInfo("c:get", //$NON-NLS-1$
            12, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_12_63 = new TagInfo("c:get", //$NON-NLS-1$
            12, 63,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_13_23 = new TagInfo("c:get", //$NON-NLS-1$
            13, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_14_26 = new TagInfo("c:get", //$NON-NLS-1$
            14, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;

com.ibm.etools.mft.pattern.sen.plugin.PatternPlugin pattern = com.ibm.etools.mft.pattern.sen.plugin.PatternPlugin.getInstance();
com.ibm.etools.mft.pattern.sen.sf.onewayackmq.PatternMessages messages = new com.ibm.etools.mft.pattern.sen.sf.onewayackmq.PatternMessages();

        RuntimeTagElement _jettag_c_if_5_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_5_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_5_1.setRuntimeParent(null);
        _jettag_c_if_5_1.setTagInfo(_td_c_if_5_1);
        _jettag_c_if_5_1.doStart(context, out);
        while (_jettag_c_if_5_1.okToProcessBody()) {
            // Tag exists 
            RuntimeTagElement _jettag_c_if_7_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_7_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_7_1.setRuntimeParent(_jettag_c_if_5_1);
            _jettag_c_if_7_1.setTagInfo(_td_c_if_7_1);
            _jettag_c_if_7_1.doStart(context, out);
            while (_jettag_c_if_7_1.okToProcessBody()) {
                // and has a value
                out.write("BROKER SCHEMA ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_9_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_15); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_9_15.setRuntimeParent(_jettag_c_if_7_1);
                _jettag_c_get_9_15.setTagInfo(_td_c_get_9_15);
                _jettag_c_get_9_15.doStart(context, out);
                _jettag_c_get_9_15.doEnd();
                out.write(NL);         
                _jettag_c_if_7_1.handleBodyContent(out);
            }
            _jettag_c_if_7_1.doEnd();
            _jettag_c_if_5_1.handleBodyContent(out);
        }
        _jettag_c_if_5_1.doEnd();
        out.write("--  Generated by ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_12_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_18); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_12_18.setRuntimeParent(null);
        _jettag_c_get_12_18.setTagInfo(_td_c_get_12_18);
        _jettag_c_get_12_18.doStart(context, out);
        _jettag_c_get_12_18.doEnd();
        out.write(" Version ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_12_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_12_63); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_12_63.setRuntimeParent(null);
        _jettag_c_get_12_63.setTagInfo(_td_c_get_12_63);
        _jettag_c_get_12_63.doStart(context, out);
        _jettag_c_get_12_63.doEnd();
        out.write(NL);         
        out.write("--  $MQSI patternName=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_13_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_13_23); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_13_23.setRuntimeParent(null);
        _jettag_c_get_13_23.setTagInfo(_td_c_get_13_23);
        _jettag_c_get_13_23.doStart(context, out);
        _jettag_c_get_13_23.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("--  $MQSI patternVersion=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_14_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_14_26); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_14_26.setRuntimeParent(null);
        _jettag_c_get_14_26.setTagInfo(_td_c_get_14_26);
        _jettag_c_get_14_26.doStart(context, out);
        _jettag_c_get_14_26.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("-- Check if logging has been switched off with UDP");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("CREATE FILTER MODULE CheckLogging");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tCREATE FUNCTION main() RETURNS BOOLEAN BEGIN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tRETURN LoggingOn;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tEND;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("END MODULE;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("CREATE Compute MODULE CreateLogMessage");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tCREATE FUNCTION main() RETURNS BOOLEAN BEGIN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("-- No MQMD header so create domain and then add MQRFH2");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tSET OutputRoot.Properties = NULL;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tCREATE FIRSTCHILD OF OutputRoot DOMAIN ('MQMD') NAME 'MQMD';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tDECLARE MQMDRef REFERENCE TO OutputRoot.MQMD;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tSET MQMDRef.Format = MQFMT_RF_HEADER_2;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tSET MQMDRef.Version = MQMD_CURRENT_VERSION;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tSET MQMDRef.CodedCharSetId = InputRoot.Properties.CodedCharSetId;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tSET MQMDRef.Encoding = InputRoot.Properties.Encoding;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tCREATE NEXTSIBLING OF MQMDRef DOMAIN('MQRFH2') NAME 'MQRFH2';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("-- Create Log data");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tSET OutputRoot.MQRFH2.(MQRFH2.Field)Version = 2;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tSET OutputRoot.MQRFH2.usr.BrokerName = SQL.BrokerName;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tDECLARE OutRef REFERENCE TO OutputRoot.MQRFH2.usr;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    SET OutRef.MessageFlowLabel = SQL.MessageFlowLabel; ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    SET OutRef.DTSTAMP =   CURRENT_TIMESTAMP;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    -- Add service information if this is the request leg    ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    IF Environment.PatternVariables.RRMode = 'Request'THEN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    SET OutRef.SOAPVersion = InputRoot.SOAP.Context.SOAP_Version;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    SET OutRef.ServiceName = InputRoot.SOAP.Context.service;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    SET OutRef.ServiceNameSpace = InputRoot.SOAP.Context.Namespace;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    SET OutRef.ServicePort = InputRoot.SOAP.Context.port;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    SET OutRef.ServicePortType = InputRoot.SOAP.Context.portType;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    SET OutRef.ServiceOperation = InputRoot.SOAP.Context.operation;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tEND IF;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tCREATE NEXTSIBLING OF OutRef DOMAIN('XMLNSC') NAME 'XMLNSC';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tSET OutputRoot.XMLNSC.Message = InputBody;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("END;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("END MODULE;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("CREATE Compute MODULE SF_CreateTraceData");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("CREATE FUNCTION main() RETURNS BOOLEAN BEGIN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tDECLARE EnvVarRef REFERENCE TO Environment.PatternVariables;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tSET EnvVarRef.DTSTAMP = CURRENT_TIMESTAMP; ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tSET EnvVarRef.BrokerName = SQL.BrokerName;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    SET EnvVarRef.MessageFlowlabel = SQL.MessageFlowLabel;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("    SET EnvVarRef.Action = InputRoot.SOAP.Context.operation;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("   \tSET EnvVarRef.Text = '");  //$NON-NLS-1$        
        out.write( pattern.getString("com.ibm.etools.mft.pattern.sen.sf.onewayackmq.esql.7") );
        out.write("';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("END;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("END MODULE;");  //$NON-NLS-1$        
        out.write(NL);         
    }
}
