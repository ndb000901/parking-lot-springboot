create table `order`
(
    id             int auto_increment
        primary key,
    car_id         varchar(16)                        not null comment '车牌号',
    enter_datetime datetime default CURRENT_TIMESTAMP not null comment '进入时间',
    parking_lot    int                                not null comment '停车厂',
    leave_datetime datetime default CURRENT_TIMESTAMP not null comment '离开时间'
)
    comment '订单表';



create table parking_lot
(
    id   int auto_increment
        primary key,
    name varchar(64) not null
)
    comment '停车场表';

create table parking_space
(
    id               int auto_increment
        primary key,
    area_id          int           not null comment '区域id',
    parking_lot_id   int           not null comment '停车厂id',
    parking_space_id int           not null comment '停车位id',
    valid            int default 1 not null comment '是否可用'
)
    comment '停车位表';
