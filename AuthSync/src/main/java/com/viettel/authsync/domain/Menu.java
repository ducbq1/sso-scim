package com.viettel.authsync.domain;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "MENU")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "name", nullable = false)
    String name;

    @Column(name = "url", nullable = false)
    String url;

    @Column(name = "icon")
    String icon;

    @Column(name = "parent_id")
    Long parentId;

    @ManyToMany(mappedBy = "menus", fetch = FetchType.LAZY)
    Set<Role> roles;
}
