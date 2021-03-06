/**
 * Copyright 2017-2017 Amazon.com,
 * Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Amazon Software License (the "License").
 * You may not use this file except in compliance with the
 * License. A copy of the License is located at
 *
 *     http://aws.amazon.com/asl/
 *
 * or in the "license" file accompanying this file. This file is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, express or implied. See the License
 * for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.kinesisvideo.client.mediasource;

/**
 * Represents the media source states.
 *
 * NOTE: Simple states for the media source. Initially, the media source is in the Initialized state.
 *
 * Later, if we need, we could add more state transitions to mimic lower-level encoders/hardware states for
 * more granularity if we need.
 *
 * Initialized -> Ready (allocate the buffers and configure the source)
 * Ready -> Running (start streaming)
 * Running -> Ready (pause stream. Doesn't de-allocate the buffers)
 * Running -> Stopped (stop the stream)
 * Ready -> Stopped (stop the stream)
 * Stopped -> NULL (need to re-initialize)
 *
 *
 */
public enum MediaSourceState {
    /**
     * Created/initialized
     */
    INITIALIZED,

    /**
     * Ready state. The buffers are allocated and configured.
     */
    READY,

    /**
     * Running state.
     */
    RUNNING,

    /**
     * Stopped state. Not initialized.
     */
    STOPPED
}
