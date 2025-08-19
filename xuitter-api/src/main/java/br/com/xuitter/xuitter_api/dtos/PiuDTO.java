package br.com.xuitter.xuitter_api.dtos;

import br.com.xuitter.xuitter_api.entities.Piu;

public class PiuDTO {

    private Long _id;
    private String _content;
    private Long _userId;

    public PiuDTO() { }

    public PiuDTO(Piu piu) {
        _id = piu.getId();
        _content = piu.getContent();
        _userId = piu.getUser().getId();
    }

    public Long getId() { return _id; }
    public String getContent() { return _content; }
    public Long getUserId() { return _userId; }

    public void setContent(String content) { _content = content; }
    public void setUserId(Long userId) { _userId = userId; }
}
