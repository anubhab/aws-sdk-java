/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.logs.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.logs.AWSLogs#testMetricFilter(TestMetricFilterRequest) TestMetricFilter operation}.
 * <p>
 * Tests the filter pattern of a metric filter against a sample of log
 * event messages. You can use this operation to validate the correctness
 * of a metric filter pattern.
 * </p>
 *
 * @see com.amazonaws.services.logs.AWSLogs#testMetricFilter(TestMetricFilterRequest)
 */
public class TestMetricFilterRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * A symbolic description of how Amazon CloudWatch Logs should interpret
     * the data in each log event. For example, a log event may contain
     * timestamps, IP addresses, strings, and so on. You use the filter
     * pattern to specify what to look for in the log event message.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     */
    private String filterPattern;

    /**
     * A list of log event messages to test.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> logEventMessages;

    /**
     * A symbolic description of how Amazon CloudWatch Logs should interpret
     * the data in each log event. For example, a log event may contain
     * timestamps, IP addresses, strings, and so on. You use the filter
     * pattern to specify what to look for in the log event message.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     *
     * @return A symbolic description of how Amazon CloudWatch Logs should interpret
     *         the data in each log event. For example, a log event may contain
     *         timestamps, IP addresses, strings, and so on. You use the filter
     *         pattern to specify what to look for in the log event message.
     */
    public String getFilterPattern() {
        return filterPattern;
    }
    
    /**
     * A symbolic description of how Amazon CloudWatch Logs should interpret
     * the data in each log event. For example, a log event may contain
     * timestamps, IP addresses, strings, and so on. You use the filter
     * pattern to specify what to look for in the log event message.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     *
     * @param filterPattern A symbolic description of how Amazon CloudWatch Logs should interpret
     *         the data in each log event. For example, a log event may contain
     *         timestamps, IP addresses, strings, and so on. You use the filter
     *         pattern to specify what to look for in the log event message.
     */
    public void setFilterPattern(String filterPattern) {
        this.filterPattern = filterPattern;
    }
    
    /**
     * A symbolic description of how Amazon CloudWatch Logs should interpret
     * the data in each log event. For example, a log event may contain
     * timestamps, IP addresses, strings, and so on. You use the filter
     * pattern to specify what to look for in the log event message.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     *
     * @param filterPattern A symbolic description of how Amazon CloudWatch Logs should interpret
     *         the data in each log event. For example, a log event may contain
     *         timestamps, IP addresses, strings, and so on. You use the filter
     *         pattern to specify what to look for in the log event message.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TestMetricFilterRequest withFilterPattern(String filterPattern) {
        this.filterPattern = filterPattern;
        return this;
    }

    /**
     * A list of log event messages to test.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @return A list of log event messages to test.
     */
    public java.util.List<String> getLogEventMessages() {
        if (logEventMessages == null) {
              logEventMessages = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              logEventMessages.setAutoConstruct(true);
        }
        return logEventMessages;
    }
    
    /**
     * A list of log event messages to test.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @param logEventMessages A list of log event messages to test.
     */
    public void setLogEventMessages(java.util.Collection<String> logEventMessages) {
        if (logEventMessages == null) {
            this.logEventMessages = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> logEventMessagesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(logEventMessages.size());
        logEventMessagesCopy.addAll(logEventMessages);
        this.logEventMessages = logEventMessagesCopy;
    }
    
    /**
     * A list of log event messages to test.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setLogEventMessages(java.util.Collection)} or {@link
     * #withLogEventMessages(java.util.Collection)} if you want to override
     * the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @param logEventMessages A list of log event messages to test.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TestMetricFilterRequest withLogEventMessages(String... logEventMessages) {
        if (getLogEventMessages() == null) setLogEventMessages(new java.util.ArrayList<String>(logEventMessages.length));
        for (String value : logEventMessages) {
            getLogEventMessages().add(value);
        }
        return this;
    }
    
    /**
     * A list of log event messages to test.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @param logEventMessages A list of log event messages to test.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TestMetricFilterRequest withLogEventMessages(java.util.Collection<String> logEventMessages) {
        if (logEventMessages == null) {
            this.logEventMessages = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> logEventMessagesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(logEventMessages.size());
            logEventMessagesCopy.addAll(logEventMessages);
            this.logEventMessages = logEventMessagesCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFilterPattern() != null) sb.append("FilterPattern: " + getFilterPattern() + ",");
        if (getLogEventMessages() != null) sb.append("LogEventMessages: " + getLogEventMessages() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getFilterPattern() == null) ? 0 : getFilterPattern().hashCode()); 
        hashCode = prime * hashCode + ((getLogEventMessages() == null) ? 0 : getLogEventMessages().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof TestMetricFilterRequest == false) return false;
        TestMetricFilterRequest other = (TestMetricFilterRequest)obj;
        
        if (other.getFilterPattern() == null ^ this.getFilterPattern() == null) return false;
        if (other.getFilterPattern() != null && other.getFilterPattern().equals(this.getFilterPattern()) == false) return false; 
        if (other.getLogEventMessages() == null ^ this.getLogEventMessages() == null) return false;
        if (other.getLogEventMessages() != null && other.getLogEventMessages().equals(this.getLogEventMessages()) == false) return false; 
        return true;
    }
    
    @Override
    public TestMetricFilterRequest clone() {
        
            return (TestMetricFilterRequest) super.clone();
    }

}
    