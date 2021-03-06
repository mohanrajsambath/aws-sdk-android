/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesis.model.transform;

import com.amazonaws.services.kinesis.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response ListTagsForStreamResult
 */
public class ListTagsForStreamResultJsonUnmarshaller implements
        Unmarshaller<ListTagsForStreamResult, JsonUnmarshallerContext> {

    public ListTagsForStreamResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListTagsForStreamResult listTagsForStreamResult = new ListTagsForStreamResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Tags")) {
                listTagsForStreamResult.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("HasMoreTags")) {
                listTagsForStreamResult.setHasMoreTags(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return listTagsForStreamResult;
    }

    private static ListTagsForStreamResultJsonUnmarshaller instance;

    public static ListTagsForStreamResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListTagsForStreamResultJsonUnmarshaller();
        return instance;
    }
}
