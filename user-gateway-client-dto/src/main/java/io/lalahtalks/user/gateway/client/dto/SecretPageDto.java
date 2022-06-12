package io.lalahtalks.user.gateway.client.dto;

import io.lalahtalks.paging.dto.PageDto;
import io.lalahtalks.paging.dto.PagingDto;
import io.lalahtalks.paging.dto.SortDto;

import java.util.List;

public final class SecretPageDto extends PageDto<SecretDto> {

    public SecretPageDto(PagingDto paging, List<SecretDto> elements, SortDto sort) {
        super(paging, elements, sort);
    }

}
