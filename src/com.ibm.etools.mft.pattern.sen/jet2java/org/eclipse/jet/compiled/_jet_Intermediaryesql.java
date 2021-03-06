package org.eclipse.jet.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_Intermediaryesql implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_Intermediaryesql() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_if_1_1 = new TagInfo("c:if", //$NON-NLS-1$
            1, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "boolean($root/brokerSchema)", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_if_3_1 = new TagInfo("c:if", //$NON-NLS-1$
            3, 1,
            new String[] {
                "test", //$NON-NLS-1$
            },
            new String[] {
                "string-length($root/brokerSchema) > 0", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_5_15 = new TagInfo("c:get", //$NON-NLS-1$
            5, 15,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/brokerSchema", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_18 = new TagInfo("c:get", //$NON-NLS-1$
            8, 18,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_8_63 = new TagInfo("c:get", //$NON-NLS-1$
            8, 63,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_9_23 = new TagInfo("c:get", //$NON-NLS-1$
            9, 23,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_10_26 = new TagInfo("c:get", //$NON-NLS-1$
            10, 26,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@patternVersion", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_42_31 = new TagInfo("c:get", //$NON-NLS-1$
            42, 31,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$root/@mqmdExpiry", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        RuntimeTagElement _jettag_c_if_1_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_1_1); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_if_1_1.setRuntimeParent(null);
        _jettag_c_if_1_1.setTagInfo(_td_c_if_1_1);
        _jettag_c_if_1_1.doStart(context, out);
        while (_jettag_c_if_1_1.okToProcessBody()) {
            // Tag exists 
            RuntimeTagElement _jettag_c_if_3_1 = context.getTagFactory().createRuntimeTag(_jetns_c, "if", "c:if", _td_c_if_3_1); //$NON-NLS-1$ //$NON-NLS-2$
            _jettag_c_if_3_1.setRuntimeParent(_jettag_c_if_1_1);
            _jettag_c_if_3_1.setTagInfo(_td_c_if_3_1);
            _jettag_c_if_3_1.doStart(context, out);
            while (_jettag_c_if_3_1.okToProcessBody()) {
                // and has a value
                out.write("BROKER SCHEMA ");  //$NON-NLS-1$        
                RuntimeTagElement _jettag_c_get_5_15 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_5_15); //$NON-NLS-1$ //$NON-NLS-2$
                _jettag_c_get_5_15.setRuntimeParent(_jettag_c_if_3_1);
                _jettag_c_get_5_15.setTagInfo(_td_c_get_5_15);
                _jettag_c_get_5_15.doStart(context, out);
                _jettag_c_get_5_15.doEnd();
                out.write(NL);         
                _jettag_c_if_3_1.handleBodyContent(out);
            }
            _jettag_c_if_3_1.doEnd();
            _jettag_c_if_1_1.handleBodyContent(out);
        }
        _jettag_c_if_1_1.doEnd();
        out.write("--  Generated by ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_8_18 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_18); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_8_18.setRuntimeParent(null);
        _jettag_c_get_8_18.setTagInfo(_td_c_get_8_18);
        _jettag_c_get_8_18.doStart(context, out);
        _jettag_c_get_8_18.doEnd();
        out.write(" Version ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_8_63 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_8_63); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_8_63.setRuntimeParent(null);
        _jettag_c_get_8_63.setTagInfo(_td_c_get_8_63);
        _jettag_c_get_8_63.doStart(context, out);
        _jettag_c_get_8_63.doEnd();
        out.write(NL);         
        out.write("--  $MQSI patternName=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_9_23 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_9_23); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_9_23.setRuntimeParent(null);
        _jettag_c_get_9_23.setTagInfo(_td_c_get_9_23);
        _jettag_c_get_9_23.doStart(context, out);
        _jettag_c_get_9_23.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("--  $MQSI patternVersion=");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_10_26 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_10_26); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_10_26.setRuntimeParent(null);
        _jettag_c_get_10_26.setTagInfo(_td_c_get_10_26);
        _jettag_c_get_10_26.doStart(context, out);
        _jettag_c_get_10_26.doEnd();
        out.write(" MQSI$");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("DECLARE ErrorLoggingOn EXTERNAL BOOLEAN TRUE;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("DECLARE RequestLoggingOn EXTERNAL BOOLEAN TRUE;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("DECLARE ResponseLoggingOn EXTERNAL BOOLEAN TRUE;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("-- This uses a database node as it is (currently) the most");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("-- efficient way of making changes to the local environment");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("CREATE DATABASE MODULE SynchRR_Initialise");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tCREATE FUNCTION Main() RETURNS BOOLEAN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tBEGIN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tSET Environment.PatternVariables.StatusCode = 0;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tDECLARE EVRef REFERENCE TO Environment.PatternVariables;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tSET EVRef.RRMode = 'Request';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t-- Set the broker queue manager here to save a compute node later");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tSET EVRef.BrokerQueueManager = SQL.QueueManagerName;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tSET EVRef.SOAPReplyIdentifier = ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\t\tLocalEnvironment.Destination.SOAP.Reply.ReplyIdentifier;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tRETURN TRUE;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tEND;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("END MODULE;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("CREATE COMPUTE MODULE SynchRR_BuildStoreMsg");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tCREATE FUNCTION Main() RETURNS BOOLEAN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tBEGIN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t-- Use same MQMD as for main message ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t-- REPLYTO will be ignored");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tSet OutputRoot.MQMD = InputRoot.MQMD; ");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tSET OutputRoot.BLOB.BLOB = \tEnvironment.PatternVariables.SOAPReplyIdentifier;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t-- SET CorrelId to Message ID of message sent to provider");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t-- This will be required by the MQGet node, which gets a message using the correlation ID.");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tSET OutputRoot.MQMD.CorrelId = InputLocalEnvironment.WrittenDestination.MQ.DestinationData.msgId;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tSET OutputRoot.MQMD.Expiry = ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_42_31 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_42_31); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_42_31.setRuntimeParent(null);
        _jettag_c_get_42_31.setTagInfo(_td_c_get_42_31);
        _jettag_c_get_42_31.doStart(context, out);
        _jettag_c_get_42_31.doEnd();
        out.write("; \t");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tRETURN TRUE;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tEND;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tEND MODULE;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("CREATE COMPUTE MODULE SynchRR_SetResponseMode");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tCREATE FUNCTION Main() RETURNS BOOLEAN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tBEGIN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tSET Environment.PatternVariables.RRMode = 'Response';");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tRETURN TRUE;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tEND;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("END MODULE;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("CREATE COMPUTE MODULE SynchRR_RestoreReplyId");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tCREATE FUNCTION Main() RETURNS BOOLEAN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tBEGIN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tSET OutputLocalEnvironment.Destination.SOAP.Reply.ReplyIdentifier = InputLocalEnvironment.BLOB.BLOB;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tSET OutputRoot.SOAP.Body = InputRoot.XMLNSC;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tSET OutputRoot.Properties.CodedCharSetId = 1208;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tRETURN TRUE;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t\tEND;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("END MODULE;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write(NL);         
        out.write("CREATE COMPUTE MODULE STRIP");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tCREATE FUNCTION Main() RETURNS BOOLEAN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tBEGIN");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("/*********************************************************");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("*  Remove HTTP header and SOAP envelope                  *");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("**********************************************************/");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\tSET OutputRoot.Properties = InputRoot.Properties;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tSET OutputRoot.XMLNSC = InputRoot.*:SOAP.*:Body[1];");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("\t\tRETURN TRUE;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\tEND;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("END MODULE;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("\t");  //$NON-NLS-1$        
    }
}
