package com.morgan.iterone.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GameVersion {
    private Game game;
    private Version version;
    private Reviews reviews;
}
