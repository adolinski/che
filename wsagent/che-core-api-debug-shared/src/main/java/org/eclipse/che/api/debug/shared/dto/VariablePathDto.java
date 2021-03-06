/*
 * Copyright (c) 2012-2018 Red Hat, Inc.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */
package org.eclipse.che.api.debug.shared.dto;

import java.util.List;
import org.eclipse.che.api.debug.shared.model.VariablePath;
import org.eclipse.che.dto.shared.DTO;

/** @author andrew00x */
@DTO
public interface VariablePathDto extends VariablePath {
  List<String> getPath();

  void setPath(List<String> path);

  VariablePathDto withPath(List<String> path);
}
