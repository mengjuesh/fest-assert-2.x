/*
 * Created on Sep 17, 2010
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright @2010-2012 the original author or authors.
 */
package org.fest.assertions.test;

import static org.fest.util.Objects.HASH_CODE_PRIME;
import static org.fest.util.Objects.areEqual;
import static org.fest.util.Objects.hashCodeFor;

/**
 * @author Alex Ruiz
 */
public class Person implements Comparable<Person> {
  private final String name;

  public Person(String name) {
    this.name = name;
  }

  public String name() {
    return name;
  }

  @Override
  public int hashCode() {
    int prime = HASH_CODE_PRIME;
    int result = 1;
    result = prime * result + hashCodeFor(name);
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Person other = (Person) obj;
    return areEqual(name, other.name);
  }

  @Override
  public int compareTo(Person other) {
    return name.compareTo(other.name);
  }

  @Override
  public String toString() {
    return String.format("Person[name='%s']", name);
  }
}
