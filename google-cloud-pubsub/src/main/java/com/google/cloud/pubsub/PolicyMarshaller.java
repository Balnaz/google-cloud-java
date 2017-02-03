/*
 * Copyright 2016 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.pubsub;

import com.google.cloud.Policy;

final class PolicyMarshaller extends Policy.DefaultMarshaller {

  static final PolicyMarshaller INSTANCE = new PolicyMarshaller();

  private PolicyMarshaller() {}

  @Override
  protected com.google.iam.v1.Policy toPb(Policy policy) {
    return super.toPb(policy);
  }

  @Override
  protected Policy fromPb(com.google.iam.v1.Policy policyPb) {
    return super.fromPb(policyPb);
  }
}